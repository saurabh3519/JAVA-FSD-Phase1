package com.simplilearn.demo;

public class Student {
	
	private int ID;
	private String name;
	private String  description;
	private String price;
	
	public Student() {
		
	}
	
	
	public Student(String name, String  description, String price) {
		this.name = name;
		this. description =  description;
		this.price= price;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}
	


	
}
