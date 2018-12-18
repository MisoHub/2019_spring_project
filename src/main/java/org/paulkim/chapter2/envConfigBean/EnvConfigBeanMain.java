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
		
		// load bean context from xml file after setting environments,
		// because UserDefineBeanImpl use environment values..
		// GenericXmlApplicationContext Object has load method to parsing spring xml configuration file. 
		GenericXmlApplicationContext gcontext = (GenericXmlApplicationContext)context;
		
		gcontext.load("classpath:**/envconfigbean.xml");
		gcontext.refresh();
		
		UserDefineBean messagePrinter = gcontext.getBean("userMessagePrinter1",UserDefineBeanImpl.class);
		messagePrinter.messagePrinter();
		
		gcontext.close();
	
	}

}
