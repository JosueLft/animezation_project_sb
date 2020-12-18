package com.reign.animezation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.animezation.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}