package com.training.quest2;

public class ZipExtractor implements IExtractor {

	@Override
	public void extracFiles(String... filenames) {
		System.out.println("Extracting from zip => files as .txt,jpeg, .doc files");
		for(String filename: filenames) {
			System.out.println(filename);
		}
	}

}
