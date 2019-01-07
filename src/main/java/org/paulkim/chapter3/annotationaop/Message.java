package org.paulkim.chapter3.annotationaop;


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
}
