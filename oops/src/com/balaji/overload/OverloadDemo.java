package com.balaji.overload;

public class OverloadDemo {

	public static void main(String[] args) {
		Shape shape= new Shape();
		shape.area(10);
		shape.area(5.5);
		int res= (int)shape.area(5,10);
		System.out.println("Result" +res);
		

	}

}
