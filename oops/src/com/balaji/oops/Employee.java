package com.balaji.oops;

public class Employee {
	
	String employeeName;
	double employeeSalary;
	int employeeId;
	
	
	
	

	public Employee(String employeeName, double employeeSalary, int employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeId = employeeId;
	}

	void getDetails() {
		System.out.println("Employee name is " +employeeName);
		System.out.println("Employee id is " +employeeId);
		System.out.println("Employee salary is " +employeeSalary);
	}
	
	String displayMessage(String message) {
		return message + employeeName;
	}

}
