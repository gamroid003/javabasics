package com.training.quest2;

public class JarExtractor implements IExtractor {

	@Override
	public void extracFiles(String... filenames) {
		System.out.println("Extracting from jar => files as .class files");
		for(String filename: filenames) {
			System.out.println(filename);
		}

	}

}
