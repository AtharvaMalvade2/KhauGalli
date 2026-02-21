package com.example.BackendOnlineFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
