package com.balaji.overload;

public class Vehicle {
	String model;
	String brand;
	double price;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	void getDetails() {
		System.out.println("Model" +model);
		System.out.println("Brand" +brand);
		System.out.println("Price" +price);
	}
	
}
