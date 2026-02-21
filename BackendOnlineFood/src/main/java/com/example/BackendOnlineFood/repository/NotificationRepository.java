package com.example.BackendOnlineFood.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BackendOnlineFood.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

	public List<Notification> findByCustomerId(Long userId);
	public List<Notification> findByRestaurantId(Long restaurantId);

}
