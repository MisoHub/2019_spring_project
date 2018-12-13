package org.paulkim.chapter1.annotationdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AnnotationDIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class); 
	
		MessagePrinter messagePrinter = context.getBean("myMessagePrinter",MessagePrinter.class);
		
		System.out.println("-----------------------");
		messagePrinter.printMessage();
		System.out.println("-----------------------");
		
		context.close();
	}

}
