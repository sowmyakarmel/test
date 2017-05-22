package com.niit.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		System.out.println("Hello world");
		/*ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		WelcomeMessage messageBean=(WelcomeMessage)context.getBean("WelcomeMessageBean");
		System.out.println(messageBean.getMessage());*/
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ApplicationContextConfig");
		
	}
}
