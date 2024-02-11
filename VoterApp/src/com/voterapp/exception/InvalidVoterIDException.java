package com.voterapp.exception;

public class InvalidVoterIDException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String statement;

	public InvalidVoterIDException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidVoterIDException(String statement) {
		System.out.println(statement);
	}
	
	
}
