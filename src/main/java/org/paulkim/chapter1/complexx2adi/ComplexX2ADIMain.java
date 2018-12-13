package org.paulkim.chapter1.complexx2adi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ComplexX2ADIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:complexa2xdi.xml"); 
	
		MessagePrinter messagePrinter = context.getBean("myMessagePrinter2",MessagePrinter.class);
		
		System.out.println("-----------------------");
		messagePrinter.printMessage();
		System.out.println("-----------------------");
	}

}
