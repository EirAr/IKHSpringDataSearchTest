package com.iknowhow.springboot.util;

public class SearchCriteria {
    private String key;
    private String operation;
    private Object value;
    
	public String getOperation() {
		return this.operation;
	}

	public String getKey() {
		return this.key;
	}

	public Object getValue() {
		return this.value;
	}
    
    
}