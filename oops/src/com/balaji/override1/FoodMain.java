package com.balaji.override1;

import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		Food food = null;
		Scanner sc = new Scanner(System.in);
		String choice =sc.next().toLowerCase();
		switch(choice) {
		case "italian":
			food = new Italian();
			break;
		case "indian":
			food = new Indian();
			break;
		case "chinese":
			food = new Chinese();
			break;
		default:
			food = new Food();
		}
		for(String item:food.showMenus()) {
			System.out.println(item);
		}
		sc.close();
	}
			
}	
			
			
			
		
//		food = new Indian();
//		for(String result:food.showMenus()) {
//			System.out.println(result);
//		}
//		food = new Italian();
//		for(String result:food.showMenus()) {
//			System.out.println(result);
//		}
//		food = new Chinese();
//		for(String result:food.showMenus()) {
//			System.out.println(result);
//		}
	

