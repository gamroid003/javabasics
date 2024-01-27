package com.balaji.inheritance;

public class SmartPhone extends Mobile {
	String[] apps;

	public SmartPhone(String brand, String model, double price, String... apps) {
		super(brand, model, price);
		this.apps = apps;
	}
	
	void showApps() {
		
		for(String app:apps) {
		System.out.println(app);
		}
		
	}
	
	

}
