package org.paulkim.chapter2.userdefinebean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserDefineBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/userdefinebean.xml"); 
	
		UserDefineBeanImpl messagePrinter = context.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		
		System.out.println("-----------------------");
		messagePrinter.messagePrinter();
		System.out.println("-----------------------");
		
		context.close();
	}

}
