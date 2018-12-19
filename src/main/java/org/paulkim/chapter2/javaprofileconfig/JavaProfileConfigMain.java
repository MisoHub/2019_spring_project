package org.paulkim.chapter2.javaprofileconfig;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class JavaProfileConfigMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("** Input value (PRD/DEV) : ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String profile = s.contentEquals("PRD") ? "prd" : "dev";
		scanner.close();
		
		// set environment with properties
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles(profile);
		// Properties order..
		context.register(BeanConfig.class, BeanConfig2.class);
		context.refresh();
		
		UserDefineBeanImpl messagePrinter1 = context.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		messagePrinter1.messagePrinter();
		
		UserDefineBeanImpl messagePrinter2 = context.getBean("userMessagePrinter2",UserDefineBeanImpl.class);
		messagePrinter2.messagePrinter();
		
		context.close();
	}

}
