package org.flowable.community.external.worker.model;

import java.util.List;

public class BpmnErrorRequest {

	private String workerId;
	private List<EngineVariable> variables;
	private String errorCode;

	public BpmnErrorRequest(String workerId) {
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

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
