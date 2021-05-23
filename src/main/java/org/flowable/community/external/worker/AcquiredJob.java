package org.flowable.community.external.worker;

import java.util.List;

import org.flowable.community.external.worker.model.EngineVariable;

public class AcquiredJob {

	private FlowableConnection connection;
	private String id;
	private List<EngineVariable> variables;
	
	AcquiredJob(AcquiredJobBuilder builder) {
		this.connection = builder.connection;
		this.id = builder.id;
		this.variables = builder.variables;
	}
	
	public List<EngineVariable> getVariables() {
		return variables;
	}

	public void complete() {
		connection.complete(id);
	}
	
	public void complete(List<EngineVariable> variables) {
		connection.complete(id,variables);
	}
	
	public void fail() {
		connection.fail(id);
	}
	
	public void fail(String errorMessage, String errorDetails, Integer retries, String retryTimeout) {
		connection.fail(id, errorMessage, errorDetails, retries, retryTimeout);
	}
	
	public void cmmnTerminate() {
		connection.cmmnTerminate(id);	
	}
	
	public void cmmnTerminate(List<EngineVariable> variables) {
		connection.cmmnTerminate(id, variables);
	}
	
	public void bpmnError() {
		connection.bpmnError(id);
	}
	
	public void bpmnError(List<EngineVariable> variables, String errorCode) {
		connection.bpmnError(id, variables, errorCode);
	}
		
}
