package org.paulkim.chapter2.externalpropertybean;

import java.io.IOException;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class ExternalPropertyBeanMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// set environment with properties
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/externalpropertybean.xml");
	
		UserDefineBean messagePrinter = context.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		messagePrinter.messagePrinter();
		
		context.close();
	
	}

}
