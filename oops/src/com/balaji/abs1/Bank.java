package com.balaji.abs1;

public abstract class Bank {
	abstract void carLoan();
	abstract void eduLoan();
	abstract void housingLoan();
	
	//concrete method
	void admin() {
		System.out.println("admin details Bank");
	}

}
