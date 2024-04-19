package com.javaweb.customeexception;

public class FieldRequireException extends RuntimeException {

	public FieldRequireException(String message){
		super(message);
	}
}
