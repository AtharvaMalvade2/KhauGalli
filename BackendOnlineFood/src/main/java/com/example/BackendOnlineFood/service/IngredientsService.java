package com.example.BackendOnlineFood.service;

import java.util.List;

import com.example.BackendOnlineFood.Exception.FoodException;
import com.example.BackendOnlineFood.Exception.RestaurantException;
import com.example.BackendOnlineFood.model.IngredientCategory;
import com.example.BackendOnlineFood.model.IngredientsItem;
import com.example.BackendOnlineFood.model.Food;
import com.example.BackendOnlineFood.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
