package com.training.quest3;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		System.out.println("Select which Mobile you want to But --> Type 1 for Touch Screen, Type 2 for Basic Phone");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			ISmartPhone smartphone = new TouchScreenMobile();
			smartphone.showApps();
			smartphone.cameraTypes();
			smartphone.call();
			smartphone.messaging();
			break;
		case 2:
			IFeaturePhone featurePhone = new BasicMobile();
			featurePhone.call();
			featurePhone.messaging();

		}
		sc.close();
	}

}
