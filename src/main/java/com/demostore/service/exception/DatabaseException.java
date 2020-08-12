package com.demostore.service.exception;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1780118267102181468L;

	public DatabaseException(String msg) {
		super(msg);
	}
}
