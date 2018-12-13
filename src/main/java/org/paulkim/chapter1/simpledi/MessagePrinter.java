package org.paulkim.chapter1.simpledi;

public class MessagePrinter {

	public Message message;

	public void setMessage(Message message) {
		this.message = message;
	}

	public void printMessage() {
		System.out.println(this.message.getText());
	}

}
