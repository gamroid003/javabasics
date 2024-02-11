package com.userapp.client;

import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValisationServiceImpl;

public class Registration {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String username = sc.nextLine().toLowerCase();
		
		IValidationService validate = new ValisationServiceImpl();
		
		try {
			validate.validateUsername(username);
			System.out.println("Enter your password: ");
			String password= sc.nextLine();
			validate.validatePassword(password);
			System.out.println("Welcome " +username+" you are registered");
		} catch (NameExistsException | TooLongException | TooShortException e) {
			e.getMessage();
		}
		sc.close();
		
	}

}
