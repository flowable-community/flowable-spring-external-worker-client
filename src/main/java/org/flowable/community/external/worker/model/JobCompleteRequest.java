package org.flowable.community.external.worker.model;

import java.util.List;

public class JobCompleteRequest {

	private String workerId;
	private List<EngineVariable> variables;

	public JobCompleteRequest(String workerId) {
		this.workerId = workerId;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public List<EngineVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<EngineVariable> variables) {
		this.variables = variables;
	}

}
