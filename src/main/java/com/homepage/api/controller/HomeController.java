package com.homepage.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homepage.api.advice.TimeExecutionAdvisor;
import com.homepage.api.models.Home;
import com.homepage.api.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	private HomeService service;
	@GetMapping("/signIn")
    @TimeExecutionAdvisor
    public ResponseEntity<Home> saveSignIn() {
       return new ResponseEntity<Home>(service.signIn(), HttpStatus.CREATED);
	}
	@GetMapping("/signOut")
	 public ResponseEntity<Home> saveSignOut() {
	       return new ResponseEntity<Home>(service.signOut(), HttpStatus.CREATED);
		}
}
