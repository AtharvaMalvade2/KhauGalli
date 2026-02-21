package com.example.BackendOnlineFood.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BackendOnlineFood.Exception.CartException;
import com.example.BackendOnlineFood.Exception.CartItemException;
import com.example.BackendOnlineFood.Exception.FoodException;
import com.example.BackendOnlineFood.Exception.UserException;
import com.example.BackendOnlineFood.model.Cart;
import com.example.BackendOnlineFood.model.CartItem;
import com.example.BackendOnlineFood.model.Food;
import com.example.BackendOnlineFood.model.User;
import com.example.BackendOnlineFood.repository.CartItemRepository;
import com.example.BackendOnlineFood.repository.CartRepository;
import com.example.BackendOnlineFood.repository.foodRepository;
import com.example.BackendOnlineFood.request.AddCartItemRequest;
import com.example.BackendOnlineFood.request.UpdateCartItemRequest;

@Service
public class CartServiceImplementation implements CartSerive {
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private CartItemRepository cartItemRepository;
	@Autowired
	private foodRepository menuItemRepository;

	@Override
	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException {

		User user = userService.findUserProfileByJwt(jwt);
		
		Optional<Food> menuItem=menuItemRepository.findById(req.getMenuItemId());
		if(menuItem.isEmpty()) {
			throw new FoodException("Menu Item not exist with id "+req.getMenuItemId());
		}

		Cart cart = findCartByUserId(user.getId());

		for (CartItem cartItem : cart.getItems()) {
			if (cartItem.getFood().equals(menuItem.get())) {

				int newQuantity = cartItem.getQuantity() + req.getQuantity();
				return updateCartItemQuantity(cartItem.getId(),newQuantity);
			}
		}

		CartItem newCartItem = new CartItem();
		newCartItem.setFood(menuItem.get());
		newCartItem.setQuantity(req.getQuantity());
		newCartItem.setCart(cart);
		newCartItem.setIngredients(req.getIngredients());
		newCartItem.setTotalPrice(req.getQuantity()*menuItem.get().getPrice());
		
		CartItem savedItem=cartItemRepository.save(newCartItem);
		cart.getItems().add(savedItem);
		cartRepository.save(cart);
		
		return savedItem;

	}

	@Override
	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException {
		Optional<CartItem> cartItem=cartItemRepository.findById(cartItemId);
		if(cartItem.isEmpty()) {
			throw new CartItemException("cart item not exist with id "+cartItemId);
		}
		cartItem.get().setQuantity(quantity);
		cartItem.get().setTotalPrice((cartItem.get().getFood().getPrice()*quantity));
		return cartItemRepository.save(cartItem.get());
	}

	@Override
	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, 
	CartException, CartItemException {

		User user = userService.findUserProfileByJwt(jwt);

		Cart cart = findCartByUserId(user.getId());
		
		Optional<CartItem> cartItem=cartItemRepository.findById(cartItemId);
		
		if(cartItem.isEmpty()) {
			throw new CartItemException("cart item not exist with id "+cartItemId);
		}

		cart.getItems().remove(cartItem.get());
		return cartRepository.save(cart);
	}

	@Override
	public Long calculateCartTotals(Cart cart) throws UserException {

		Long total = 0L;
		for (CartItem cartItem : cart.getItems()) {
			total += cartItem.getFood().getPrice() * cartItem.getQuantity();
		}
		return total;
	}

	@Override
	public Cart findCartById(Long id) throws CartException {
		Optional<Cart> cart = cartRepository.findById(id);
		if(cart.isPresent()) {
			return cart.get();
		}
		throw new CartException("Cart not found with the id "+id);
	}

	@Override
	public Cart findCartByUserId(Long userId) throws CartException, UserException {
	
		Optional<Cart> opt=cartRepository.findByCustomer_Id(userId);
		
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new CartException("cart not found");
		
	}

	@Override
	public Cart clearCart(Long userId) throws CartException, UserException {
		Cart cart=findCartByUserId(userId);
		
		cart.getItems().clear();
		return cartRepository.save(cart);
	}

	

}
