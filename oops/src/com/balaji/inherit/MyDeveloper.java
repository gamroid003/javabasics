package com.balaji.inherit;

public class MyDeveloper extends MyEmployee {
	
	String training;

	public MyDeveloper(String empName, int empId, String city, String training) {
		super(empName, empId, city);
		this.training = training;
	}

	@Override
	void calcBonus(int amount) {
		System.out.println("Developer Bonus" +amount);
	}
	
	void showCourses() {
		System.out.println("JavaFullStack");
	}
	
	

}
