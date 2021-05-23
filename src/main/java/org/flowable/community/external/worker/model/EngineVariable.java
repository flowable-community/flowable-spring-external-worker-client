package org.flowable.community.external.worker.model;

public class EngineVariable {

	private String name;
	private Object value;
	private String type;
	private String valueUrl;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Object getValue() {
		return value;
	}
	
	public void setValue(Object value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValueUrl() {
		return valueUrl;
	}

	public void setValueUrl(String valueUrl) {
		this.valueUrl = valueUrl;
	}
	
}
