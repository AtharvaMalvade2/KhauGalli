package com.example.BackendOnlineFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
