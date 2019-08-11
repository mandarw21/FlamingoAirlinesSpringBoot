package com.flamingo.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.controller.services.UserServices;
import com.flamingo.model.User;

@RestController
@RequestMapping("/Users")
public class UserResources {

	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public String createuser(@RequestParam("id") int userId, 
			@RequestParam("name") String userName,
			@RequestParam("email") String emailId,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender,
			@RequestParam("mobileNo") long mobileNumber
			) {
		
		User user = new User(userId,userName,emailId,age,gender,mobileNumber);
		userServices.insertUser(user);
		
		
		
		return "User "+userId+ " created successfully";
		
	}
	
}
