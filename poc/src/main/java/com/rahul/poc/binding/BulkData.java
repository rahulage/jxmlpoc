package com.rahul.poc.binding;

public class BulkData {
	private int error;
	private String type;
	private String path;
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		return "BulkData [error=" + error + ", type=" + type + ", path=" + path + "]";
	}
}
