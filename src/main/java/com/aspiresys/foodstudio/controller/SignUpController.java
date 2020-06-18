package com.aspiresys.foodstudio.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.foodstudio.model.Login;
import com.aspiresys.foodstudio.model.User;
import com.aspiresys.foodstudio.service.SignUpService;
import com.aspiresys.foodstudio.util.Util;

@RestController
@RequestMapping("signup")
public class SignUpController {
	
	@Autowired
	SignUpService signUpService;
	
	
	@PostMapping
	public Login CreateUserLogin(@RequestBody Login login) {
		
	
//		Session session = Util.getSessionFactory().openSession();
//		Transaction tr = session.beginTransaction();
//		
//		try {
//		login.setRole("USER");
//		
//		session.save(login);
//		
//		tr.commit();
//		session.close();
//		
//		login.setPassword(null);
//		//return login;
//		}catch(Exception e) {
//			tr.rollback();
//			session.close();
//		}
		
		login = signUpService.CreateUserLogin(login);
		return login;
		
	}
	
	@PostMapping(path = "/createUser")
	public User CreateUser(@RequestBody User user) {
		
//		Session session = Util.getSessionFactory().openSession();
//		Transaction tr = session.beginTransaction();
//		
//		session.save(user);
//		tr.commit();
//		session.close();
		
		user = signUpService.CreateUser(user);
		return user;
	}

}
