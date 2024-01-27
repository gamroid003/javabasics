package com.balaji.overload;

public class VarArgsDemo {
	
	void sum(String name,int... marks) {
		System.out.println(name);
		System.out.println(marks.length);
		int total=0;
		for(int m:marks) {
			total=total+m;
			
		}
		System.out.println("Total"+total);
	}

	public static void main(String[] args) {
		VarArgsDemo varargsdemo= new VarArgsDemo();
		varargsdemo.sum("Balaji", 20,12,1);
	}

}
