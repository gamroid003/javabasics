package com.voterapp.exception;

public class LocalityNotFoundException extends NotEligibleException {

	private String statement;

	public LocalityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalityNotFoundException(String statement) {
		System.out.println(statement);
	}
	
	
}
