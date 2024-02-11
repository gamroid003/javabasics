package com.voterapp.exception;

public class UnderAgeException extends NotEligibleException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String statement;

	
	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UnderAgeException(String statement) {
		System.out.println(statement);
	}
	
	

}
