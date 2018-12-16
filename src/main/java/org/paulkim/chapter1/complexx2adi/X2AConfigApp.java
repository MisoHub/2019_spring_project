package org.paulkim.chapter1.complexx2adi;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
// import XML configuration file into Annotation file.
@ImportResource("classpath:complexx2adi.xml")
public class X2AConfigApp {
	
	private Message propertyMessage = new Message("Hello Spring Annotation Config");
	ArrayList<String> myArrayList = new ArrayList<String>(Arrays.asList(new String[] {"jessy","gregory", "vencent", "james", "haruki"}));
	
	
	@Bean 
	public MessagePrinter myMessagePrinter3() {
		return new MessagePrinter(propertyMessage);
	}
	
	@Bean 
	public MessagePrinter myMessagePrinter4() {
		return new MessagePrinter(propertyMessage,myArrayList);
	}

}