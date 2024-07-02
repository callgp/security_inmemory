package com.ait.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	
	@GetMapping("/about")
	public String about() {
		return "welcome to method about";

	}
	
	@GetMapping("/contact")
	public String contact() {
		return "welcome to method contact";

	}
	
	@GetMapping("/deposit")
	public String deposit() {
		return "welcome to method deposit";

	}
	
	@GetMapping("/withdraw")
	public String withdraw() {
		return "welcome to method withdraw";

	}


}
