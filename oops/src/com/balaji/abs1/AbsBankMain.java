package com.balaji.abs1;

public class AbsBankMain {

	public static void main(String[] args) {
		Bank bank = new Branch1();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		bank.admin();
		
		
		Branch1 branch = (Branch1) bank;
		branch.payLoan();
		
		
		
		bank = new SubBranch();
		//bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		bank.admin();
		System.out.println();
		
		
		SubBranch subBranch = (SubBranch) bank;
		subBranch.checkDeposit();
		subBranch.payInterest();
		subBranch.carLoan();
		subBranch.eduLoan();
		subBranch.housingLoan();
		subBranch.admin();
		
			
			
	}

}
