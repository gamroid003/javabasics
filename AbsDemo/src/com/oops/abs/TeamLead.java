package com.oops.abs;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("TeamLead Bonus :"+ (amount+salary));
	}

	
	

}
