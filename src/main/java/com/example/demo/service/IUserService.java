package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.repository.IUserRepository;

@Service 
public class IUserService {
	@Autowired
	private IUserRepository repo;
	
	public User addNewUser(User iu) {
		 return  repo.save(iu);
		
	}
	public User signIn(User iu) {
		
		//return  repo.findByUserIdAndPassword(iu.getUserId(),iu.getPassword()).orElseThrow(()->
       // new ResourceNotFoundException("Invalid credentials "));
			return iu;
	}
	
}
