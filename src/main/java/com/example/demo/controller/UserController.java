package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;


@RestController
public class UserController {
	
	@Autowired
	private  IUserService service ;
	
	@PostMapping("/addNewUser")
	public  ResponseEntity<User> addNewUser(@RequestBody User u) {

		return new ResponseEntity<User>(service.addNewUser(u), HttpStatus.CREATED);
	}
	
}


