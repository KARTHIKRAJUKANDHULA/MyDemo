package com.mindtree.exception;

public class ApiException extends RuntimeException {
	private static final int serialVersionUID=1;
	public ApiException(String message) {
		super(message);
	}
}
