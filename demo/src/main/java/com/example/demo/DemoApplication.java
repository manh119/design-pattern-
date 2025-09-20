package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Order.OrderProcess;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		// demo order processing and payment handling logic here
		System.out.println("Application started...");
		// print all bean names in context
		// ApplicationContext context = SpringApplication.run(DemoApplication.class,
		// args);

		// get bean from context and use it
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		OrderProcess orderProcess = context.getBean(OrderProcess.class);
		orderProcess.processOrder("ORD123", 250.75, "Visa");

	}

}
