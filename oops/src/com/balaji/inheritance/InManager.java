package com.balaji.inheritance;

public class InManager extends InEmployee{
	double salary;
	
	
	
	public InManager(String name, int empId) {
		super(name, empId);
		// TODO Auto-generated constructor stub
	}
	
	





	public InManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}







	void add(double amount) {
		System.out.println("Bonus" + (this.salary+amount));
	}

	
}
