package com.burtona.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ServiceLocator {
	private static ServiceLocator instance = null;
	private SessionFactory sessionFactory;
	private static final transient Logger logger = Logger.getLogger(ServiceLocator.class);

	public static synchronized ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	private ServiceLocator() {
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception ne) {
			ne.printStackTrace();
			logger.error("Unable to create session factory. ", ne);
		}		
	}
		
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;	
	}
}
