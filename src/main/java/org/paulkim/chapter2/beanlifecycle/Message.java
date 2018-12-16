package org.paulkim.chapter2.beanlifecycle;

import javax.annotation.*;

public class Message {
	public String text;
	
	public Message() {}
	
	public Message(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	// set post-construct method annotation
	@PostConstruct
	public void init() {
		System.out.println("Messege Object init");
		if(text == null) {
			text = "init text with annotation";
		}
	}

	// set pre-destroy method with annotation 
	@PreDestroy
	public void destroy() {
		System.out.println("Messege Object destroy");
		text = null;
	}
	
}
