package org.paulkim.chapter1.propertydi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PropertyDIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:propertydi.xml");

		MessagePrinter messagePrinter = context.getBean("myMessagePrinter2",MessagePrinter.class);
		
		System.out.println("-----------------------");
		messagePrinter.printMessage();
		System.out.println("-----------------------");
	}

}
