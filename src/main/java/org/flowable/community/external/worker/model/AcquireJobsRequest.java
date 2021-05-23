package org.flowable.community.external.worker.model;

public class AcquireJobsRequest {

	private String topic;
	private String lockDuration;
	private Integer numberOfTasks;
	private String workerId;
	private Integer numberOfRetries;
	private String scopeType;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLockDuration() {
		return lockDuration;
	}

	public void setLockDuration(String lockDuration) {
		this.lockDuration = lockDuration;
	}

	public Integer getNumberOfTasks() {
		return numberOfTasks;
	}

	public void setNumberOfTasks(Integer numberOfTasks) {
		this.numberOfTasks = numberOfTasks;
	}

	public String getWorkerId() {
		return workerId;
	}

	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}

	public Integer getNumberOfRetries() {
		return numberOfRetries;
	}

	public void setNumberOfRetries(Integer numberOfRetries) {
		this.numberOfRetries = numberOfRetries;
	}

	public String getScopeType() {
		return scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

}
