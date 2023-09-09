package com.in28miniutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age) {};
record Address(String firstLine ,String City) {};
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		
		return "Ranga";
	}
	
	@Bean
	public Person person() {
		
		var person=new Person("Shubham",21);
		
		return person;
	}
	
	
	@Bean
	public Address address() {
		return new Address("22-jumpstreet","Atlanta");
	}
}
