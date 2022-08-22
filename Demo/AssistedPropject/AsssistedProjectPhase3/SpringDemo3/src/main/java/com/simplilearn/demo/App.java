package com.simplilearn.demo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String [] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student s=(Student) context.getBean("s1");
    	
    	System.out.println("Id: "+s.getId());
    	System.out.println("Name: "+s.getName());
    	
    	Marks m1 = s.getMarks();
    			System.out.println("phy: "+m1.getPhy());
    			System.out.println("che: "+m1.getChem());
    			System.out.println("maths: "+m1.getMaths());
    			
	}
	

}
