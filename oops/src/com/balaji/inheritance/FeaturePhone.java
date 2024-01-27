package com.balaji.inheritance;

public class FeaturePhone extends Mobile {

	String buttonType;

	public FeaturePhone(String brand, String model, double price, String buttonType) {
		super(brand, model, price);
		this.buttonType = buttonType;
	}
	
	void checkPhoneType() {
		
	if(buttonType.equals("sponge")) 
			System.out.println("Premium Phone");
		else if(buttonType.equals("hard"))
			System.out.println("Standard Phone");
		else 
			System.out.println("Local Piece");
	}
	


}
