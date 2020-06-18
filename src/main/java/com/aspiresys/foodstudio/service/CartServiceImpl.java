package com.aspiresys.foodstudio.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.aspiresys.foodstudio.model.Cart;
import com.aspiresys.foodstudio.util.Util;

@Service
public class CartServiceImpl implements CartService {

	@Override
	public Cart addToCart(Cart cart) {
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(cart);
		tr.commit();
		session.close();
		return cart;
		//return null;
	}

	


}
