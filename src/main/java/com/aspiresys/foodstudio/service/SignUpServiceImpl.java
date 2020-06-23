package com.aspiresys.foodstudio.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.aspiresys.foodstudio.model.Login;
import com.aspiresys.foodstudio.model.Users;
import com.aspiresys.foodstudio.util.Util;

@Service
public class SignUpServiceImpl implements SignUpService{

	@Override
	public Login CreateUserLogin(Login login) {

		Session session = Util.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		try {
		login.setRole("USER");
		
		//System.out.println(user);
		//login.setUser(user);
		
		session.persist(login);
		
		System.out.println(login);
		
		tr.commit();
		session.close();
		
		login.setPassword(null);
		//return login;
		}catch(Exception e) {
			System.out.println("exceptio"+e);
			tr.rollback();
			session.close();
		}
		return login;
	}

	@Override
	public Users CreateUser(Users user) {
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(user);
		tr.commit();
		session.close();
		return user;
	}
	
	

}
