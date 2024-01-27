package com.balaji.abs;

public abstract class Vehicle {
	abstract void getMileage();
	abstract void getAccessories();
	
	void showDetails() {
		System.out.println("in Vechile class");
	}
}
