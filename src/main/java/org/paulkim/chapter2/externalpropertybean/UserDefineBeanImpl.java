package org.paulkim.chapter2.externalpropertybean;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDefineBeanImpl
		implements UserDefineBean, BeanNameAware,  InitializingBean, DisposableBean {

	private String beanName;
	private Message message;
	private ArrayList<String> receivers;

	// use default constructor
	public UserDefineBeanImpl() {

	}

	public void messagePrinter() {
		// TODO Auto-generated method stub
		System.out.println(" >> bean name : " + this.beanName);
		for (String s : receivers) {
			System.out.println("TO." + s + " : " + this.message.getText());
		}
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" >> init Bean...");
	}

	// get bean name after initialize bean.. 
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName = arg0;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" >> end method...");
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public void setReceivers(ArrayList<String> receivers) {
		this.receivers = receivers;
	}

	public void setReceiversWithStrings(String[] receivers) {
		this.receivers = new ArrayList<String>(Arrays.asList(receivers));
	}

	public Message getMessage() {
		return this.message;
	}

	public ArrayList<String> getReceivers() {
		return this.receivers;
	}
}
