package com.oops.abs;

public class Developer extends TeamLead{
	double chargeperHour;
	String sportsName;
	
	public Developer(String empName, double salary, int empId, double chargeperHour, String sportsName) {
		super(empName, salary, empId);
		this.chargeperHour = chargeperHour;
		this.sportsName = sportsName;
	}
	@Override
	String[] showCourse() {
		return new String[] {"Developer Java Full Stack","Developer Python"};
	}
	@Override
	void showProjects() {
		System.out.println("Developer Learning Portal" + "Ecom Site");
	}
	
	void gamesClub() {
		System.out.println(sportsName +" "+chargeperHour);
	}
	
	

}
