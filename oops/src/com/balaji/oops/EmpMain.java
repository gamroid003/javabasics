package com.balaji.oops;

public class EmpMain {
	public static void main(String[] args) {
		Employee  employee = new Employee("Hh",567.55,3);
		
		employee.getDetails();
		String message= employee.displayMessage("Welcome");
		System.out.println(message);
		
		Employee  employee1 = new Employee("Balaji",345.66,2);
	
		employee1.getDetails();
		String message1= employee1.displayMessage("Bye");
		System.out.println(message1);
		
	}

}
