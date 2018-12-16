package org.paulkim.chapter1.complexx2adi;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ComplexX2ADIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(X2AConfigApp.class);

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
