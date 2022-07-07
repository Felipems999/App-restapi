package com.felipe.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	@GetMapping
	public String HelloPessoa() {
		return "Hello Pessoa";
	}

}
