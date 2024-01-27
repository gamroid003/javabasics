package com.balaji.override1;

public class Italian extends Food {

	@Override
	String[] showMenus() {
//		String[] italianFood = {"Pasta","Bread","cheese"};
//		return italianFood;
		return new String[] {"Pasta","Bread","cheese"};
	}
	

}
