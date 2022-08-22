package com.simplilearn.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
         
    	
    	//default event handling

    	ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("main-servlet.xml");
    	context1.start();
    	context1.stop();
    	
    	
    	
    }
}
