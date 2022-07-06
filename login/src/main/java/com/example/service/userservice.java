package com.example.service;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class userservice {
	@Service
	@Transactional
	public class NewUserServices {

	    @Autowired
	    userDao userDao;

	    public NewUserServices() {
	        System.out.println("<<<<<<Post Service is INSTANTIATED>>>>");
	    }

	    public User saveUser(User user) {
	        User.save(user);
	    return user;
	}

	}

}
