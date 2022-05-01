package com.jpa;

import java.util.List;
import java.util.Optional;

import javax.sound.midi.Soundbank;
import javax.xml.bind.SchemaOutputResolver;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.entities.User;

@SpringBootApplication
public class JpalearningApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.
				run(JpalearningApplication.class, args);
		
		
	UserRepo userRepo=context.getBean(UserRepo.class);
//		User user=new User();
//		
//		user.setName("Nishant");
//		user.setCity("Rky");
//		User user2=userRepo.save(user);
//		System.out.println(user2);
	
	
	User user3= new User();
	user3.setName("Kushi kumari");
	user3.setCity("Rampur");
	userRepo.save(user3);
	System.out.println(user3);
	
		
	
//		Optional<User> findById = userRepo.findById(1);
//
//		User user = findById.get();
//		System.out.println(user);
//
// 
	
	
	List<User> findByName = userRepo.findByName("Kushi kumari");
	
	findByName.forEach(e->System.out.println(e));
	}

}
