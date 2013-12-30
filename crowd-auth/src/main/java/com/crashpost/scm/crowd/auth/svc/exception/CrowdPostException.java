package com.crashpost.scm.crowd.auth.svc.exception;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Thrown if an httppost does not result in a success, e.g. stauts code 200
 * 
 * @author tobyboyd
 * 
 */
public class CrowdPostException extends Exception {

	private JsonNode jsonBody;
	private int statusCode;
	
	private static final long serialVersionUID = 1L;
	
	public CrowdPostException(int statusCode, JsonNode jsonBody, String message){
		super(message);
		this.jsonBody = jsonBody;
		this.statusCode = statusCode;
	}

	public JsonNode getJsonBody() {
		return jsonBody;
	}

	public void setJsonBody(JsonNode jsonBody) {
		this.jsonBody = jsonBody;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	

}
