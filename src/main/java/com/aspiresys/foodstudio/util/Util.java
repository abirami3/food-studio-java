package com.aspiresys.foodstudio.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

	public static SessionFactory getSessionFactory() {
		
		Configuration config = new Configuration().configure();
		//ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//SessionFactory sessionFactory = config.buildSessionFactory(reg);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		return sessionFactory;
		
	}
}
