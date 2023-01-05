package com.azure.azuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to azure demo !!!";
	}
}
