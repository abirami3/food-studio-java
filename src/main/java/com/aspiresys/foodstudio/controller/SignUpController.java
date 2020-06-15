package com.aspiresys.foodstudio.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspiresys.foodstudio.model.Login;
import com.aspiresys.foodstudio.model.User;

@RestController
@RequestMapping("signup")
public class SignUpController {
	
	
	@PostMapping
	public Login CreateUser(@RequestBody Login login) {
		
		
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		try {
		login.setRole("USER");
		
		session.save(login);
		
		tr.commit();
		session.close();
		
		login.setPassword(null);
		//return login;
		}catch(Exception e) {
			tr.rollback();
			session.close();
		}
		return login;
		
	}
	
//	@PostMapping
//	public User signUpNewUser(@RequestBody User user) {
//		return user;
//	}

}
