package org.paulkim.chapter2.envConfigBean;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class EnvConfigBeanMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// set environment with properties
		ConfigurableApplicationContext context = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = context.getEnvironment();
		env.getPropertySources().addLast(new ResourcePropertySource("classpath:envconfigbean.properties"));
		
		context.getResource("classpath:**/envconfigbean.xml");
		context.refresh();
		
		UserDefineBean messagePrinter = context.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		
		messagePrinter.messagePrinter();
	}

}
