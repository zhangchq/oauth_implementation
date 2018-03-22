package com.rzi.secured.service;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@SpringBootApplication
@EnableResourceServer
@RestController
public class SecuredServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuredServiceApplication.class, args);
	}

	@RequestMapping("/customers")
	public ArrayList<Customer> getCustomers()
	{
		Customer john = new Customer("John", "Smith");
		Customer mike = new Customer("Mike", "Seeman");

		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(john);
		customers.add(mike);

		return customers;
	}

	public class Customer {
		public String firstName;
		public String lastName;

		public Customer(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}

}
