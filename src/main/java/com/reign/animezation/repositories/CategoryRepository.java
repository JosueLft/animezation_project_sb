package com.reign.animezation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.animezation.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}