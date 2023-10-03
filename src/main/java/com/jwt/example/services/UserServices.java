package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.example.models.User;




@Service
public class UserServices {
	
	
	
	private List<User> store = new ArrayList<>();


	public UserServices() {
		
		
	store.add(new User(UUID.randomUUID().toString(),"Dhiraj mane","dhiraj.mane@gmil.com"));
	store.add(new User(UUID.randomUUID().toString(),"Niraj mane","niraj.mane@gmil.com"));
	store.add(new User(UUID.randomUUID().toString(),"vanita mane","vanita.mane@gmil.com"));
	store.add(new User(UUID.randomUUID().toString(),"durgesh kadam","durgesh.mane@gmil.com"));
	
			
	} 
	
	
public List<User> getUsers()
{
	return this.store;
	
}
}
