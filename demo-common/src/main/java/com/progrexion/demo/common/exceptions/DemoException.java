package com.progrexion.demo.common.exceptions;

public class DemoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public DemoException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	



}
