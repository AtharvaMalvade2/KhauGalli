package com.example.BackendOnlineFood.service;

import com.example.BackendOnlineFood.Exception.CartException;
import com.example.BackendOnlineFood.Exception.CartItemException;
import com.example.BackendOnlineFood.Exception.FoodException;
import com.example.BackendOnlineFood.Exception.UserException;
import com.example.BackendOnlineFood.model.Cart;
import com.example.BackendOnlineFood.model.CartItem;
import com.example.BackendOnlineFood.model.Food;
import com.example.BackendOnlineFood.model.User;
import com.example.BackendOnlineFood.request.AddCartItemRequest;
import com.example.BackendOnlineFood.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
