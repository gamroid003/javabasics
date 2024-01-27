package com.balaji.inherit;

public class InheritMain {

	public static void main(String[] args) {
		MyEmployee employee = new MyManager("Balaji", 1, "Chennai", 23455.0);
		employee.calcBonus(1000);
		MyManager manager= (MyManager)employee;
		manager.funClub();
		employee = new MyDeveloper("NEWBALAJI", 2, "USA", "jfs");
		employee.calcBonus(1000);
		employee.getDetails();
		MyDeveloper developer = (MyDeveloper)employee;
		developer.showCourses();
	}

}
