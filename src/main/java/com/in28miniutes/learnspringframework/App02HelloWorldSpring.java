package com.in28miniutes.learnspringframework;

import org.springframework.context.annotation.*;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
	var context =
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
	System.out.println(context.getBean("name"));	
	System.out.println(context.getBean("person"));
	System.out.println(context.getBean("address"));
	
	}

}
