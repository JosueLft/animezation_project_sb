package com.reign.animezation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reign.animezation.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}