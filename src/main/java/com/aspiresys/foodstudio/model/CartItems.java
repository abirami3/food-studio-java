package com.aspiresys.foodstudio.model;

import javax.persistence.Entity;

@Entity
public class CartItems {
	
	private int cartId;
	private int dishId;
	private int quantity;
	private int price;
	private int discount;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public CartItems(int cartId, int dishId, int quantity, int price, int discount) {
		super();
		this.cartId = cartId;
		this.dishId = dishId;
		this.quantity = quantity;
		this.price = price;
		this.discount = discount;
	}
	public CartItems() {
	
	}
	
	

}
