package com.simplilearn.encapsulation;
import java.io.Serializable;

public class Student implements  Serializable{
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private String division;
	private String std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}

	

}
