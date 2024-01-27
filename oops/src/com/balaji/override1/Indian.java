package com.balaji.override1;

public class Indian extends Food {

	@Override
	String[] showMenus() {
		String[] indianFood = {"Dosa","Idly","Parotta"};
		return indianFood;
	}
	

}
