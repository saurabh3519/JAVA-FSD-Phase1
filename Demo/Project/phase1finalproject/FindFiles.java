package com.simplilearn.phase1finalproject;

import java.io.File;
import java.nio.file.Files;
import java.applet.*;

public class FindFiles {
	
	private int numberofDirs;
	private int numberofFiles;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FindFiles{"+
				"numberofDirs=" + numberofDirs +
				",numberofFiles=" + numberofFiles +
				'}';
	}
	
	private void findFiles(File file) {
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath());
			numberofFiles++;
		} else {
			numberofDirs++;
			File[] files = file.listFiles();
			for (File file1: files) {
				findFiles(file1);
			}
		};
		
	}

	public static void main(String[] args) {
		
		FindFiles findFiles = new FindFiles();
		String filePath = "E:\\GitHub\\phase-1\\demo";
		File file = new File(filePath);
		
		findFiles.findFiles(file);
		System.out.println(findFiles);
	}

}
