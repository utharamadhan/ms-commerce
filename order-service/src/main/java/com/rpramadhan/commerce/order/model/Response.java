package com.rpramadhan.commerce.order.model;

import java.io.Serializable;

public class Response implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3521646014298205523L;
	
	private String responseCode;
	
	private String responseDesc;
	
	private Object result;
	
	public String getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}
	
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	
	public Object getResult() {
		return result;
	}
	
	public void setResult(Object result) {
		this.result = result;
	}
	
}
