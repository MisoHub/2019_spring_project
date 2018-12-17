package org.paulkim.chapter2.beanscope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanScopeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/beanscope.xml");
	
		// singleton + singleton Message DI
		MessagePrinter messagePrinterS1 = context.getBean("myMessagePrinter3",MessagePrinter.class);
		MessagePrinter messagePrinterS2 = context.getBean("myMessagePrinter3",MessagePrinter.class);
		
		// default-singleton MessagePrinter + prototype Message DI
		MessagePrinter messagePrinterS3 = context.getBean("myMessagePrinter4",MessagePrinter.class);
		MessagePrinter messagePrinterS4 = context.getBean("myMessagePrinter4",MessagePrinter.class);
	
		// prototype MessagePrinter + prototype Message DI
		MessagePrinter messagePrinterP1 = context.getBean("myMessagePrinter5",MessagePrinter.class);
		MessagePrinter messagePrinterP2 = context.getBean("myMessagePrinter5",MessagePrinter.class);
		
		Message message1 = context.getBean("prototypeConstMessage",Message.class);
		Message message2 = context.getBean("prototypeConstMessage",Message.class);
		
		// check singleton + singleton 
		messagePrinterS1.printMessage();
		messagePrinterS1.getMessage().setText("[changed]"+messagePrinterS1.getMessage().getText());
		messagePrinterS2.printMessage();
		System.out.println(messagePrinterS1);
		System.out.println(messagePrinterS2);
		System.out.println(messagePrinterS1.getMessage());
		System.out.println(messagePrinterS2.getMessage());
		
		
		System.out.println("------------------");
		
		// check prototype + singleton 
		messagePrinterS3.printMessage();
		messagePrinterS3.getMessage().setText("[changed]"+messagePrinterS3.getMessage().getText());
		messagePrinterS4.printMessage();
		System.out.println(messagePrinterS3);
		System.out.println(messagePrinterS4);
		System.out.println(messagePrinterS3.getMessage());
		System.out.println(messagePrinterS4.getMessage());
		
		System.out.println("------------------");
		
		// check prototype + prototype  
		messagePrinterP1.printMessage();
		messagePrinterP1.getMessage().setText("[changed]"+messagePrinterP1.getMessage().getText());
		messagePrinterP2.printMessage();
		System.out.println(messagePrinterP1);
		System.out.println(messagePrinterP2);
		System.out.println(messagePrinterP1.getMessage());
		System.out.println(messagePrinterP2.getMessage());
		
	
	}

}
