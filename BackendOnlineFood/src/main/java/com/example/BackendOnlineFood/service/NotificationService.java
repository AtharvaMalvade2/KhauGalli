package com.example.BackendOnlineFood.service;

import java.util.List;

import com.example.BackendOnlineFood.model.Notification;
import com.example.BackendOnlineFood.model.Order;
import com.example.BackendOnlineFood.model.Restaurant;
import com.example.BackendOnlineFood.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
