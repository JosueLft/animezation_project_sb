package com.reign.animezation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.animezation.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}