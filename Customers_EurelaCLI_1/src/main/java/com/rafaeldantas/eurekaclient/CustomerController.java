package com.rafaeldantas.eurekaclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@GetMapping
	public List<String> findAll() {
		return Arrays.asList("Customer 1", "Customer 2", "Customer 3", "Customer 4");
	}
	
}
