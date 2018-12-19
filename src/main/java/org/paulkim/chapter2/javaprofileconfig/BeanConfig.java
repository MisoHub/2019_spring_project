package org.paulkim.chapter2.javaprofileconfig;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class BeanConfig {

	@Value("${mybean.name}")
	private String beanName;
	
	@Value("${mybean.message}")
	private String text;
	
	@Value("#{'${mybean.receivers}'.split(',')}")
	private String[] receivers;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource[] locations = new Resource[3];
		locations[0] = new ClassPathResource("org/paulkim/chapter2/externalpropertybean.properties");
		locations[1] = new ClassPathResource("org/paulkim/chapter2/externalpropertyjava.properties");
		locations[2] = new ClassPathResource("org/paulkim/chapter2/envconfigbean.properties");
		
		configurer.setLocations(locations);
		
		return configurer;
	}
	
	@Bean
	public UserDefineBeanImpl userMessagePrinter1() {
		UserDefineBeanImpl beanImpl = new UserDefineBeanImpl();
		beanImpl.setBeanName(this.beanName);
		beanImpl.setMessage(new Message(this.text));
		beanImpl.setReceivers(new ArrayList<String>(Arrays.asList(receivers)));
		return beanImpl;
	}
		
}
