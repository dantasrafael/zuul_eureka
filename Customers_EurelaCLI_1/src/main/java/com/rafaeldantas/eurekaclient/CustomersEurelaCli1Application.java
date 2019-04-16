package com.rafaeldantas.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomersEurelaCli1Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomersEurelaCli1Application.class, args);
	}

}
