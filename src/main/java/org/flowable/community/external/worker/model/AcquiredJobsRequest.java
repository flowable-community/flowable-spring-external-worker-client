package org.flowable.community.external.worker.model;

import java.util.List;

public class AcquiredJobsRequest {

	private String id;
	private String url;
	private List<EngineVariable> variables;
	private String correlationId;
	private String processInstanceId;
	private String processDefinitionId;
	private String executionId;
	private String scopeId;
	private String subScopeId;
	private String scopeDefinitionId;
	private String scopeType;
	private String elementId;
	private String elementName;
	private String retries;
	private String exceptionMessage;
	private String dueDate;
	private String createTime;
	private String tenantId;
	private String lockOwner;
	private String lockExpirationTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<EngineVariable> getVariables() {
		return variables;
	}

	public void setVariables(List<EngineVariable> variables) {
		this.variables = variables;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getScopeId() {
		return scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	public String getSubScopeId() {
		return subScopeId;
	}

	public void setSubScopeId(String subScopeId) {
		this.subScopeId = subScopeId;
	}

	public String getScopeDefinitionId() {
		return scopeDefinitionId;
	}

	public void setScopeDefinitionId(String scopeDefinitionId) {
		this.scopeDefinitionId = scopeDefinitionId;
	}

	public String getScopeType() {
		return scopeType;
	}

	public void setScopeType(String scopeType) {
		this.scopeType = scopeType;
	}

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getRetries() {
		return retries;
	}

	public void setRetries(String retries) {
		this.retries = retries;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getLockOwner() {
		return lockOwner;
	}

	public void setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
	}

	public String getLockExpirationTime() {
		return lockExpirationTime;
	}

	public void setLockExpirationTime(String lockExpirationTime) {
		this.lockExpirationTime = lockExpirationTime;
	}

}
