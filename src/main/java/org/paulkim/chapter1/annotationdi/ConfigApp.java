package org.paulkim.chapter1.annotationdi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
	@Autowired	Message myMessage;
	
	
	@Bean
	public Message myMessage() {
		return new Message("hello Annotation DI Message");
	}
	
	@Bean
	public MessagePrinter myMessagePrinter() {
		
		ArrayList<String> receivers = new ArrayList<String>();
		
		receivers.add("jessy");
		receivers.add("gregory");
		receivers.add("vencent");
		receivers.add("james");
		receivers.add("haruki");
		
		return new MessagePrinter(myMessage,receivers);
	}
	
	
}
