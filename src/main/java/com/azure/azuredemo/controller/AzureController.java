package com.azure.azuredemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

	//@GetMapping("/message")
	@RequestMapping(value = "/message")
	public String getMessage() {
		return "Welcome to azure demo !!!";
	}
}
