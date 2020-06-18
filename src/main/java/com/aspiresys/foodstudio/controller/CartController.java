package com.aspiresys.foodstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.foodstudio.model.Cart;
import com.aspiresys.foodstudio.service.CartService;

@RestController
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	CartService cartService;

	@PostMapping
	public Cart addToCart(@RequestBody Cart cart) {
		
		cartService.addToCart(cart);
		
		return cart;
	}
	
	
	
	
	

}
