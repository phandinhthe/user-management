package com.mobiclix.usermanagement.mapper.exception;

public class UserErrorMessage {
	private String errorMessage;
	
	public UserErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
