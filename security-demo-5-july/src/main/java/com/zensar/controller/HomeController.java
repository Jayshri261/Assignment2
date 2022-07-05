package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.service.UserService;

@RestController
public class HomeController {

	@GetMapping("/")
	public String Sayhello() {
		return "<h2>Hello</h2>";
	}
}
