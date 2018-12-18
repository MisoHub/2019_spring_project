package org.paulkim.chapter2.externalpropertyjava;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class ExternalPropertyJavaMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// set environment with properties
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExternalConfig.class);
	
		UserDefineBean messagePrinter = context.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		messagePrinter.messagePrinter();
		
		context.close();
	
	}

}
