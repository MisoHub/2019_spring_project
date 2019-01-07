package org.paulkim.chapter3.annotationaop;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class AnnotationAopMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// set environment with properties
		//	AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExternalConfig.class);
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/annotationaop.xml");
		
		// Message class doesn't be adjusted by advice 
//		Message message = context.getBean("myMessage",Message.class);
//		System.out.println(message.getText());
		
		MessagePrinter messagePrinter = context.getBean("userMessagePrinter1",MessagePrinter.class);
		messagePrinter.printMessage();
		
		context.close();
	
	}

}
