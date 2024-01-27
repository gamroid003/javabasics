package com.balaji.inheritance;

public class ResultMain {

	public static void main(String[] args) {
		InEmployee inEmployee = new InEmployee("Balaji",10);
		
		inEmployee.print();
		InManager inManager= new InManager("Bai",20);
		
		inManager.print();
		
	}

}
