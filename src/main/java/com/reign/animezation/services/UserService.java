package com.reign.animezation.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.reign.animezation.entities.User;
import com.reign.animezation.repositories.UserRepository;
import com.reign.animezation.services.exceptions.DatabaseException;
import com.reign.animezation.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);			
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {
		try {
			User entity = repository.getOne(id); // PREPARA OBJETO MONITORADO
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		entity.setCpf(obj.getCpf());
		entity.setBirthDate(obj.getBirthDate());
		entity.setCep(obj.getCep());
		entity.setAddres(obj.getAddres());
		entity.setNumber(obj.getNumber());
		entity.setComplement(obj.getComplement());
		entity.setNeighborhood(obj.getNeighborhood());
		entity.setCity(obj.getCity());
		entity.setState(obj.getState());
	}
}