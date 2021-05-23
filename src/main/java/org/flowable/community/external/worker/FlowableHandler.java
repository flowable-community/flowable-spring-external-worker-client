package org.flowable.community.external.worker;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.flowable.community.external.worker.annotation.FlowableWorker;
import org.flowable.community.external.worker.config.FlowableConfig;
import org.flowable.community.external.worker.model.AcquiredJobsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FlowableHandler {

	@Autowired
	private FlowableConfig flowableConfig;
	
	@Autowired
	private FlowableConnection connection;
	
	private Map<Method,Object> workerMethods;
	
	@Scheduled(fixedDelayString="10000")
	public void handle() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for(Method method:workerMethods.keySet()) {
			Object bean = workerMethods.get(method);
			FlowableWorker worker = method.getAnnotation(FlowableWorker.class);
			if(worker != null) {
				connection.setClient(createClient(worker));
				List<AcquiredJobsRequest> jobs = connection.acquireJobs();
				for(AcquiredJobsRequest job:jobs) {
					method.invoke(bean, mapJob(job,connection));
				}
			}
		}
	}
	
	private AcquiredJob mapJob(AcquiredJobsRequest jobFromEngine, FlowableConnection connection) {
		AcquiredJob result = AcquiredJobBuilder.create()
												.connection(connection)
												.id(jobFromEngine.getId())
												.variables(jobFromEngine.getVariables())
												.build();
		return result;
	}
	
	private WorkerClient createClient(FlowableWorker worker) {
		WorkerClient client = WorkerClientBuilder.create()
												.toUrl(flowableConfig.getUrl())
												.topic(worker.topic())
												.username(flowableConfig.getUsername())
												.password(flowableConfig.getPassword())
												.workerId(flowableConfig.getWorkerId())
												.maxTasks(worker.maxTasks())
												.lockDuration(worker.lockDuration())
												.numberOfRetries(worker.numberOfRetries())
												.scopeType(worker.scopeType())
												.build();
		return client;
	}
	
	public void setWorkerMethods(Map<Method,Object> workerMethods) {
		this.workerMethods = workerMethods;
	}
	
	Map<Method,Object> getWorkerMethods ( ) {
		return this.workerMethods;
	}
	
	
}
