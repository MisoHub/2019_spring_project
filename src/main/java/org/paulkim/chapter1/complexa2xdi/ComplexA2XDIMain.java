package org.paulkim.chapter1.complexa2xdi;

import java.util.ArrayList;

import org.paulkim.chapter1.complexa2xdi.MessagePrinter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ComplexA2XDIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:**/complexa2xdi.xml"); 
				
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
