package com.petishtry.petcare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Firstcontroller {
	@GetMapping("/pet")
	public Response getPet() {
		String i = "10";
		Response response = new Response();
		response.setResult1(i);
		response.setResult2("Hello World");
		return response;
	}

	@PostMapping("/arun")
	public String dsrun() {
		return "Hello ArunFs";
	}

}
