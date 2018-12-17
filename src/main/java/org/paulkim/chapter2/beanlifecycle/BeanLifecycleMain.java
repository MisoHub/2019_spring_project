package org.paulkim.chapter2.beanlifecycle;

import java.util.ArrayList;

import org.paulkim.chapter2.beanlifecycle.MessagePrinter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanLifecycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/beanlifecycle.xml"); 
	
		ArrayList<MessagePrinter> messagePrinterList = new ArrayList<MessagePrinter>();
		messagePrinterList.add(context.getBean("myMessagePrinter2", MessagePrinter.class));
		messagePrinterList.add(context.getBean("myMessagePrinter3", MessagePrinter.class));
		messagePrinterList.add(context.getBean("myMessagePrinter4", MessagePrinter.class));

		for (MessagePrinter messagePrinter : messagePrinterList) {
			System.out.println("-----------------------");
			messagePrinter.printMessage();
		}
		System.out.println("-----------------------");
		context.close();
	}

}
