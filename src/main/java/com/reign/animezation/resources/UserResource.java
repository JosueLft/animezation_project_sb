package com.reign.animezation.resources;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> 9aee6a2... 		--- User e UserResource ---
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reign.animezation.entities.User;
<<<<<<< HEAD
import com.reign.animezation.services.UserService;
=======
>>>>>>> 9aee6a2... 		--- User e UserResource ---

@RestController
@RequestMapping(value = "/users")
public class UserResource {

<<<<<<< HEAD
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
=======
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Teste", "teste@gmail.com", "999999999", "12345", null, null, null, null, null, null, null, null, null);
		return ResponseEntity.ok().body(u);
>>>>>>> 9aee6a2... 		--- User e UserResource ---
	}
}