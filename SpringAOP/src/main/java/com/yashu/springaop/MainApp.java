package com.yashu.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee a = factory.getBean("proxy2", Employee.class);
		a.printEmp();

//		AgeValidator age = factory.getBean("proxy2", AgeValidator.class);
//		try{
//			age.validate(24);
//		}
//		
//		catch(Exception e){
//			e.printStackTrace();
//		}
	}

}
