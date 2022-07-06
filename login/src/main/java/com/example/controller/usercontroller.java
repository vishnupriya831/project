package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Errorclazz;
import com.example.entities.user;
import com.example.service.userservice;

@RestController
@RequestMapping("/user")
public class usercontroller{
	@Autowired
	userservice userservices;
	private Object userservice;
	@PostMapping("/save")
	public ResponseEntity<?> saveuser(@RequestBody user User){
		try {
			User=userservice.saveuser(User);
			return new ResponseEntity<user>(User,HttpStatus.CREATED);
					catch(Exception e) {
						//TODO handle exception
						Errorclazz errorClazz=new Errorclazz(500,e.getMessage());
						return new ResponseEntity<Errorclazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
						
					}
		
		
		
	
		}
}
