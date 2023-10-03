package com.jwt.example.controllers;

import java.security.Principal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.models.User;
import com.jwt.example.services.UserServices;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
   private UserServices userServices;
   

	@GetMapping("/users")
	public List<User> getUser()
	{
		System.out.println("getting users");
		return this.userServices.getUsers();
		
	}
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal)
	{
		return principal.getName();
	}
	

}
