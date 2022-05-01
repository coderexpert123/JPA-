package com.jpa.dao;


import java.security.PublicKey;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.entities.User;

 
public interface UserRepo extends CrudRepository<User, Integer> {

	
	public List<User> findByName(String name);
	
}
