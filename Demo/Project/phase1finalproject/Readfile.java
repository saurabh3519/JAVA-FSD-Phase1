package com.simplilearn.phase1finalproject;

import java.io.FileReader;
import java.io.IOException;

public class Readfile {
	
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("E:\\\\GitHub\\\\phase-1\\\\demo\\\\Phase-1project\\\\testFile.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			readFileReaderClass();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not available");
		}
	}

}
