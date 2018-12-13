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
	
	@PostConstruct
	public void init() {
		if(text == null) {
			text = "init text with annotation";
		}
	}
	
	@PreDestroy
	public void destroy() {
		text = null;
	}
	
}
