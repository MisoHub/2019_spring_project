package org.paulkim.chapter1.complexa2xdi;

import java.util.ArrayList;
import java.util.Arrays;

import org.paulkim.chapter1.complexa2xdi.Message;
import org.paulkim.chapter1.complexa2xdi.MessagePrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A2XConfigApp {

	@Bean 
	public MessagePrinter myMessagePrinter3() {
		Message propertyMessage = new Message("Hello Spring Annotation Config");	
		ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList(new String[] {"jessy","gregory", "vencent", "james", "haruki"}));

		return new MessagePrinter(propertyMessage);
	}
	
	@Bean 
	public MessagePrinter myMessagePrinter4() {
		Message propertyMessage = new Message("Hello Spring Annotation Config");	
		ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList(new String[] {"jessy","gregory", "vencent", "james", "haruki"}));

		return new MessagePrinter(propertyMessage,myArrayList);
	}


}
