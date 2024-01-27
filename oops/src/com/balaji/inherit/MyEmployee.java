package com.balaji.inherit;

public class MyEmployee {
	
	String empName;
	int empId;
	String city;
	public MyEmployee(String empName, int empId, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
	}
	
	void getDetails() {
		System.out.println(empName+" "+empId+" "+city);
	}
	void calcBonus(int amount) {
		System.out.println("MyEmployee Bonus");
	}

}
