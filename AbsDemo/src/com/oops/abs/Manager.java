package com.oops.abs;

public class Manager extends Employee {
	
	String activity;

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus"+ (amount+salary));
	}

	@Override
	String[] showCourse() {
		return new String[] {"Manager Java Full Stack","Developer Python"};
	}

	@Override
	void showProjects() {
		System.out.println("Manager Learning Portal" + "Ecom Site");
	}
	
	void funClub() {
		System.out.println("Manager Activity :"+activity);
	}
	

}
