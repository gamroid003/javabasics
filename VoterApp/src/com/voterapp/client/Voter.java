package com.voterapp.client;

import java.util.Scanner;

import com.voterapp.exception.NotEligibleException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class Voter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age:  ");
		int age = sc.nextInt();
		System.out.println("Enter your vid : ");
		int vid = sc.nextInt();
		System.out.println("Enter your locality : ");
		String local = sc.next();

		IElectionBoothService service = new ElectionBoothServiceImpl();

		try {
			service.checkEligibility(age, local, vid);
			System.out.println("You are eligible to vote");
		} catch (NotEligibleException e) {
			e.getMessage();
		}
		sc.close();
	}
}
