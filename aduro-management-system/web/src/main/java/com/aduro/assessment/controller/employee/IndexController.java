package com.aduro.assessment.controller.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 
 * @author vamsithatikonda
 * 
 *         Sample controller class
 *
 */
@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String sayHello() {
		return "Hello and Welcome to the Aduro Management System application. You can create a new Note by making a POST request to /api/* endpoint.";
	}
}
