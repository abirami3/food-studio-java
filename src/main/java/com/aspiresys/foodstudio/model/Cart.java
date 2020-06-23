package com.aspiresys.foodstudio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Cart {
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@OneToOne(cascade = CascadeType.ALL)
	private int cartId;
	private int restaurantId;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	
	public Cart(int cartId, int restaurantId) {
		super();
		this.cartId = cartId;
		this.restaurantId = restaurantId;
	}
	
	public Cart() {

	}

}
