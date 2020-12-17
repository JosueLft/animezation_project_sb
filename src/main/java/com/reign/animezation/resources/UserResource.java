package com.reign.animezation.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reign.animezation.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Teste", "teste@gmail.com", "999999999", "12345", null, null, null, null, null, null, null, null, null);
		return ResponseEntity.ok().body(u);
	}
}