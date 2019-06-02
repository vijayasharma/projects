package com.vijaya.metis.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api")
public class ClinicRegistrationController {

	@PostMapping(value = "/")
	public void registerClinic() {
		
	}
}
