package org.paulkim.chapter1.complexa2xdi;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class ConfigApp {

	@Bean 
	public ArrayList<String> myReceiverList(){
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("jessy");
		arrList.add("gregory");
		arrList.add("vencent");
		arrList.add("james");
		arrList.add("haruki");

		return arrList;
		
	}

}
