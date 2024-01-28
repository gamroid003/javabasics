package com.oops.abs;

public class DemoAbs {

	public static void main(String[] args) {
		Employee employee = new Manager("Balaji", 50000, 827484, "MFT Admin");
		employee.calcBonus(10000);
		for(String course: employee.showCourse()) {
			System.out.println(course);
		}
		employee.showProjects();
		employee.showRules();
		employee.printDetails();
		Manager manager = (Manager)employee;
		manager.funClub();
		
		Employee employee1 = new Developer("Mohan", 40000, 12345, 10, "Cricket");
		for(String course: employee1.showCourse()) {
			System.out.println(course);
		}
		employee1.showProjects();
		employee1.calcBonus(1000);
		employee1.showRules();
		employee1.printDetails();
		Developer developer = (Developer)employee1;
		developer.gamesClub();
	}

}
