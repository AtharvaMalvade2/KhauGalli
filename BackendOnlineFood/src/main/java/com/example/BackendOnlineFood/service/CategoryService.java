package com.example.BackendOnlineFood.service;

import java.util.List;

import com.example.BackendOnlineFood.Exception.RestaurantException;
import com.example.BackendOnlineFood.model.Category;

public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
