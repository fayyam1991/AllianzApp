package com.india.allianz.model;

import org.springframework.http.HttpStatus;

public class ResponseEntity {
	private HttpStatus status;
	private String message;

	public ResponseEntity(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	public boolean isOk() {
		return this.status.equals(HttpStatus.OK);
	}
	

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
