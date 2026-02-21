package com.example.BackendOnlineFood.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.example.BackendOnlineFood.Exception.CartException;
import com.example.BackendOnlineFood.Exception.OrderException;
import com.example.BackendOnlineFood.Exception.RestaurantException;
import com.example.BackendOnlineFood.Exception.UserException;
import com.example.BackendOnlineFood.model.Order;
import com.example.BackendOnlineFood.model.PaymentResponse;
import com.example.BackendOnlineFood.model.User;
import com.example.BackendOnlineFood.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
