package com.reign.animezation.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.reign.animezation.entities.User;
import com.reign.animezation.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Pablo Rodrigues", "pablorodrigo1996@hotmail.com", "11970707070", "Gajuel123", null, null, null, null, null, null, null, null, null);
		User u2 = new User(null, "Gabriel Tomaz", "gazinhogodi@outlook.com", "11960606060", "Gabriel39234500gazinho", null, null, null, null, null, null, null, null, null);

		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}