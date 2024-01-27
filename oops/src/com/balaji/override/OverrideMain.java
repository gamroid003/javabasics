package com.balaji.override;

import java.util.Scanner;

public class OverrideMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for add , 2 for diff, 3 for prod");
		int choice = sc.nextInt();
		Calculator calculator = null;
		switch(choice) {
		case 1:
		calculator = new Adder();
			calculator.calculate(10, 20);
			break;
		case 2:
			calculator = new Difference();
			calculator.calculate(10, 20);
			break;
		case 3:
			calculator = new Product();
			calculator.calculate(10, 20);
			break;
		}
		sc.close();
	}
	

}
