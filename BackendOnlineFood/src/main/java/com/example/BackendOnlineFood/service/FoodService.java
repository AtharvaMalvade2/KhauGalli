package com.example.BackendOnlineFood.service;

import java.util.List;

import com.example.BackendOnlineFood.Exception.FoodException;
import com.example.BackendOnlineFood.Exception.RestaurantException;
import com.example.BackendOnlineFood.model.Category;
import com.example.BackendOnlineFood.model.Food;
import com.example.BackendOnlineFood.model.Restaurant;
import com.example.BackendOnlineFood.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
