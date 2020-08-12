package com.demostore.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1788268540755503556L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

}
