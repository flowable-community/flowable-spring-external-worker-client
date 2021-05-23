package org.flowable.community.external.worker;

import org.springframework.stereotype.Component;

@Component
class WorkerClient {

	String url;
	String topic;
	String workerId;
	Integer maxTasks;
	String lockDuration;
	Integer numberOfRetries;
	String scopeType;
	String username;
	String password;


	protected WorkerClient(WorkerClientBuilder builder) {
		this.url = builder.url;
		this.topic = builder.topic;
		this.workerId = builder.workerId;
		this.maxTasks = builder.maxTasks;
		this.lockDuration = builder.lockDuration;
		this.numberOfRetries = builder.numberOfRetries;
		this.scopeType = builder.scopeType;
		this.username = builder.username;
		this.password = builder.password;
	}
	
}
