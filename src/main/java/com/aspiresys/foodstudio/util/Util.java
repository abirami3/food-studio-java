package com.aspiresys.foodstudio.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	public static SessionFactory getSessionFactory() {
		
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		return sessionFactory;
		
	}
}
