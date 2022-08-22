package com.simplilearn.custom;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.custom.CustomEventPublisher;

public class App 
{
    public static void main( String[] args )
    {
         //BeanFactory factory= new XmlBeanFactory(resources);
    	
    	

    	ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("main-servlet.xml");
    	
    	
    	//custom event handling
    	
    	CustomEventPublisher cep=(CustomEventPublisher)context1.getBean("cep");
    	cep.publish();
    	
    	
    	
    }
}