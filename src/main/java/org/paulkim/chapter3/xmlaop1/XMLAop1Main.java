package org.paulkim.chapter3.xmlaop1;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class XMLAop1Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// set environment with properties
		//	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExternalConfig.class);
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/xmlaop1.xml");
		
		MessagePrinter messagePrinter = context.getBean("userMessagePrinter1",MessagePrinter.class);
		messagePrinter.printMessage();
		
		context.close();
	
	}

}