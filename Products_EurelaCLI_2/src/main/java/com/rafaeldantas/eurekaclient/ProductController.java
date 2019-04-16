package com.rafaeldantas.eurekaclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@GetMapping
	public List<String> findAll() {
		return Arrays.asList("Product 1", "Product 2", "Product 3", "Product 4");
	}
	
}
