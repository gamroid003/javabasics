package com.balaji.inheritance;

public class InEmployee {
	String name;
	int empId =10;
	
	





	public InEmployee(String name) {
		super();
		this.name = name;
	}



	public InEmployee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}



	void print() {
		System.out.println("Name" + this.name);
		System.out.println("EMPID"+ this.empId);
	}
}
