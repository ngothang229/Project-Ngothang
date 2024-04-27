package com.javaweb.customeexception;

public class FieldRequireException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public FieldRequireException(String message){
		super(message);
	}
}