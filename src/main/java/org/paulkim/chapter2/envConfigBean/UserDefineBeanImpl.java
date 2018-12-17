package org.paulkim.chapter2.envConfigBean;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class UserDefineBeanImpl
		implements UserDefineBean, BeanNameAware, EnvironmentAware, InitializingBean, DisposableBean {

	private String beanName;
	private Message message;
	private ArrayList<String> receivers;
	private Environment env;

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


	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName = arg0;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" >> end method...");
	}


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" >> init Bean...");

		setBeanName(this.env.getProperty("mybean.name"));
		setMessage(new Message(this.env.getProperty("mybean.message")));
		setReceiversWithStrings(this.env.getProperty("mybean.receivers", String[].class));
		receivers.clear();

		receivers.add("jessy");
		receivers.add("gregory");
		receivers.add("vencent");
		receivers.add("james");
		receivers.add("haruki");
	}


	public void setEnvironment(Environment arg0) {
		// TODO Auto-generated method stub
		this.env = arg0;
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
