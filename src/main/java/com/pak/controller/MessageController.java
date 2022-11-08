package com.pak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pak.service.MessageServiceImpl;

@RestController
@RequestMapping("/hello")
public class MessageController {

	@Autowired
	private MessageServiceImpl service;
	 
	@GetMapping("/")
	public String getMessage() {
		System.out.println("Get Message");
		return service.getMessage();
	}
}
