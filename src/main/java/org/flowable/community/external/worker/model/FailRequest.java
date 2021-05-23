package org.flowable.community.external.worker.model;

public class FailRequest {

	private String workerId;
	private String errorMessage;
	private String errorDetails;
	private Integer retries;
	private String retryTimeout;
	
	public FailRequest(String workerId) {
		this.workerId = workerId;
	}
	
	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	public Integer getRetries() {
		return retries;
	}
	public void setRetries(Integer retries) {
		this.retries = retries;
	}
	public String getRetryTimeout() {
		return retryTimeout;
	}
	public void setRetryTimeout(String retryTimeout) {
		this.retryTimeout = retryTimeout;
	}
	
}
