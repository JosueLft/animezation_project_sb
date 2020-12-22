package com.reign.animezation.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.reign.animezation.entities.Order;
import com.reign.animezation.entities.User;
import com.reign.animezation.repositories.OrderRepository;
import com.reign.animezation.repositories.UserRepository;

@Configuration
@Profile("test") // indicando que a configuração só será executada caso seja o profile test que esteja invocando
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Pablo Rodrigues", "pablorodrigo1996@hotmail.com", 11970707070L, "Gajuel123", null, null, null, null, null, null, null, null, null);
		User u2 = new User(null, "Gabriel Tomaz", "gazinhogodi@outlook.com", 11960606060L, "Gabriel39234500gazinho", null, null, null, null, null, null, null, null, null);
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}