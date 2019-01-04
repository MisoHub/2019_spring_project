package org.paulkim.chapter3.xmlaop1;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ExternalConfig {

	@Value("${mybean.message}")
	private String text;
	
	@Value("#{'${mybean.receivers}'.split(',')}")
	private String[] receivers;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource[] locations = new Resource[1];
		locations[0] = new ClassPathResource("org/paulkim/chapter3/xmlaop1.properties");
		configurer.setLocations(locations);
		return configurer;
	}
	
	@Bean
	public MessagePrinter userMessagePrinter1() {
		MessagePrinter beanImpl = new MessagePrinter();
		beanImpl.setMessage(new Message(this.text));
		beanImpl.setReceivers(new ArrayList<String>(Arrays.asList(receivers)));
		return beanImpl;
	}
}
