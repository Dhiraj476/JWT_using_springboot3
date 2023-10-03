package com.jwt.example.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.models.About;
import com.jwt.example.models.User;
import com.jwt.example.services.AboutServices;
import com.jwt.example.services.UserServices;
@RestController
@RequestMapping("/about")
public class AboutController {
	
	
	@Autowired
	   private AboutServices aboutServices;
	   

		@GetMapping("/fans")
		public List<About> getUser()
		{
			System.out.println("getting fans");
			return this.aboutServices.getAbouts();
			
		}
		@GetMapping("/current-user")
		public String getLoggedInUser(Principal principal)
		{
			return principal.getName();
		}
		

	

}
