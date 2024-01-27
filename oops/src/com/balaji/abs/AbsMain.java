package com.balaji.abs;

public class AbsMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.getAccessories();
		vehicle.getMileage();
		vehicle.showDetails();
		
		vehicle = new MiniVan();
		vehicle.getAccessories();
		vehicle.getMileage();
		vehicle.showDetails();
	}

}
