package com.training.quest2;

public class RarExtractor implements IExtractor {

	@Override
	public void extracFiles(String... filenames) {
		System.out.println("Extracting from Rar => files as .tex files from linux os");
		for(String filename: filenames) {
			System.out.println(filename);
		}

	}

}
