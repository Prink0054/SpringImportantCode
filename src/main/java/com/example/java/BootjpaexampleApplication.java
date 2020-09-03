package com.example.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.java.dao.UserRepository;
import com.example.java.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext = 	SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository repository =  applicationContext.getBean(UserRepository.class);
	User user = new User();
	user.setName("prink");
	user.setCity("tohna");
	user.setStatus("tohahhhha");
	
	
User user2 = 	repository.save(user);
	

System.out.println("//////////_______________");
System.out.println(user2);
	
	
	
	}

}
