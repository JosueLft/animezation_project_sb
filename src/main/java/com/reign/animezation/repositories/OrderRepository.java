package com.reign.animezation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.animezation.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}