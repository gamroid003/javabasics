package com.balaji.override1;

public class Chinese extends Food {

	@Override
	String[] showMenus() {
		
		String[] chineseFood = {"Noodles","fried rice","soup"};
		return chineseFood;
	}

		
}
