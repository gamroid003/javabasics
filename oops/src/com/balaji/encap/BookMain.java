package com.balaji.encap;

public class BookMain {

	public static void main(String[] args) {
//		plain old java object(pojo)
		Book book = new Book();
		book.setTitle("Java");
		book.setPrice(1000);
		System.out.println("Title"+ book.getTitle() + "Price" + book.getPrice());
		
		}
	}


