package com.balaji.inherit;

public class MyManager extends MyEmployee {

	double salary;

	public MyManager(String empName, int empId, String city, double salary) {
		super(empName, empId, city);
		this.salary = salary;
	}

	@Override
	void calcBonus(int amount) {
		System.out.println("My Manager Bonus"+ (salary+amount));
	}
	void funClub() {
		System.out.println("Fun Day MyManager");
	}
	
	
	
	

}
