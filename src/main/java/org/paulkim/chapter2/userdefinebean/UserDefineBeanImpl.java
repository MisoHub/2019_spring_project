package org.paulkim.chapter2.userdefinebean;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanNameAware;

public class UserDefineBeanImpl implements UserDefineBean, BeanNameAware{

	private String beanName;
	public Message message;
	public ArrayList<String> receivers;
			
	
	public UserDefineBeanImpl(Message message, ArrayList<String> receivers) {
		this.message = message;
		this.receivers = receivers;
	}
	

	public void messagePrinter() {
		// TODO Auto-generated method stub
		System.out.println(" >> bean name : "+this.beanName );
		for(String s : receivers) {
			System.out.println("TO."+ s +" : "+this.message.getText());
		}
	}

	public void init() {
		System.out.println(" >> init method");
		
		this.beanName="userDefineBean";
		
		receivers.clear();
				
		receivers.add("jessy");
		receivers.add("gregory");
		receivers.add("vencent");
		receivers.add("james");
		receivers.add("haruki");
	}

	public void end() {
		System.out.println(" >> end method");
	}

	
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName = arg0;
	}
}
