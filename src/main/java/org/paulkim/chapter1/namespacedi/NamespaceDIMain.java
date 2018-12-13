package org.paulkim.chapter1.namespacedi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NamespaceDIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:namespacedi.xml");

		MessagePrinter messagePrinter = context.getBean("myMessagePrinter4",MessagePrinter.class);
		
		System.out.println("-----------------------");
		messagePrinter.printMessage();
		System.out.println("-----------------------");
		
		context.close();
	}

}
