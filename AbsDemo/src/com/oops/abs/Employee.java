package com.oops.abs;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME="COGNIZANT";
	
	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}
	
	void printDetails() {
		System.out.println("EmpName: "+ empName + " Salary: " + salary+" EmpId: "+empId+" Company Name: "+ COMPANYNAME);
		
	}
	
	abstract void calcBonus(double amount);
	abstract String[] showCourse() ;
//	{return new String[]{"java","data engineering"};}
	abstract void showProjects();
	
	final void showRules() {
		officeHours();
		System.out.println("Leave Policies");
		System.out.println("Od Policies");
	}
	
	private void officeHours() {
		System.out.println("10Hours per day");
	}
}
