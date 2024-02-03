package com.training.quest2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice :");
		String choice = sc.next().toLowerCase();
		IExtractor extractor = new ZipExtractor();
		switch (choice) {
		case "z":
			extractor.extracFiles("a.txt", "b.txt", "c.txt");
			break;
		case "j":
			extractor = new JarExtractor();
			extractor.extracFiles("a.class", "b.class", "c.class");
			break;
		case "r":
			extractor = new RarExtractor();
			extractor.extracFiles("a.tex", "b.tex", "c.tex");
			break;

		}
		sc.close();
	}

}
