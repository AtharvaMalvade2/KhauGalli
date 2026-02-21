package com.example.BackendOnlineFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
