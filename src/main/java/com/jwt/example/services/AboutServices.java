package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.models.About;
import com.jwt.example.models.User;

@Service
public class AboutServices {
	
	private List<About> ab  = new ArrayList<>
();
	public AboutServices() {
		
		
		ab.add(new About(1234,"Dhiraj mane","dhiraj.mane@gmil.com"));
		ab.add(new About(1345,"Niraj mane","niraj.mane@gmil.com"));
		ab.add(new About(1567,"vanita mane","vanita.mane@gmil.com"));
		ab.add(new About(1879,"durgesh kadam","durgesh.mane@gmil.com"));
		
				
		} 
		
		
	public List<About> getAbouts()
	{
		return this.ab;
		
	}
}
