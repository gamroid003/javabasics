package com.balaji.abs1;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("car loan in subbranch");
	}
	
	void payInterest() {
		System.out.println("Pay Interest SubBranch");
	}

}
