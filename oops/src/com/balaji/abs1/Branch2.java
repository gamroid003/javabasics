package com.balaji.abs1;

public abstract class Branch2 extends Bank {


	@Override
	void eduLoan() {
		System.out.println("edu Loan in branch 2");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch 2");
	}
	void checkDeposit() {
		System.out.println("Check Deposit Branch 2");
	}

}
