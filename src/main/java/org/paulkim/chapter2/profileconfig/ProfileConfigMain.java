package org.paulkim.chapter2.profileconfig;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.context.support.GenericXmlApplicationContext;


public class ProfileConfigMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("** Input value (PRD/DEV) : ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String profile = s.contentEquals("PRD") ? "prd" : "dev";
		System.out.println("result:"+s.contentEquals("PRD"));
		System.out.println(profile);
		scanner.close();
		
		// set environment with properties
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles(profile);
		context.load("classpath:**/profileconfig-prd.xml","classpath:**/profileconfig-dev.xml");
		context.refresh();
		
		MessagePrinter messagePrinter = context.getBean("myMessagePrinter1",MessagePrinter.class);
		messagePrinter.printMessage();
		
		context.close();
	
	}

}
