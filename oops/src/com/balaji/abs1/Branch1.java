package com.balaji.abs1;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("car loan in branch 1");
	}

	@Override
	void eduLoan() {
		System.out.println("edu Loan in branch 1");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch 1");
	}
	
	//own method of branch1
	void payLoan() {
		System.out.println("pay loan in branch1");
	}

}
