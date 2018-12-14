package org.paulkim.chapter2.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanLifecycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:beanlifecycle.xml"); 
	
		MessagePrinter messagePrinter = context.getBean("myMessagePrinter2",MessagePrinter.class);
		
		System.out.println("-----------------------");
		messagePrinter.printMessage();
		System.out.println("-----------------------");
		
		context.close();
	}

}
