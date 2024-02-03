package com.training.quest1;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice :");
		String choice = sc.next().toLowerCase();
		IInstitute institute = new EmployeeCourses();
		switch (choice) {
		case "e":
			for (String course : institute.showCourses()) {
				System.out.println(course);
			}

			break;

		case "s":
			institute = new StudentCourses();
			for (String course : institute.showCourses()) {
				System.out.println(course);
			}
			break;
			

		}
		sc.close();

	}

}
