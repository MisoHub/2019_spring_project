package org.paulkim.chapter1.complexx2adi;

import java.util.ArrayList;

public class MessagePrinter {

	public Message message;
	public ArrayList<String> receivers;

	public MessagePrinter() {}
	
	public MessagePrinter(Message message ) {
		this.message = message;
		this.receivers = new ArrayList<String>();
		receivers.add("anyone");
	}
	
	public MessagePrinter(Message message, ArrayList<String> receivers) {
		this.message = message;
		this.receivers = receivers;
	}
	
	public void setReceivers(ArrayList<String> receivers) {
		this.receivers = receivers;
	}
	public void setMessage(Message message) {
		this.message = message;
	}

	public void printMessage() {
		for(String s : receivers) {
			System.out.println("TO."+ s +" : "+this.message.getText());
		}
	}

}
