package com.balaji.inheritance;

public class MobileMain {

		public static void main(String[] args) {
			SmartPhone smartPhone= new SmartPhone("Apple","13pro",3456.56,"swiggy","whatsapp","insta");
			smartPhone.showApps();
			smartPhone.printDetails();
			FeaturePhone featurePhone= new FeaturePhone("Apple","15pro",3456.56, "hard");
			featurePhone.checkPhoneType();
			featurePhone.printDetails();
		}
}