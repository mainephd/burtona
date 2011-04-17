package com.burtona.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.burtona.db.model.SaleStatus;
import com.burtona.util.ServiceLocator;

public class StoreManager {
	private static StoreManager instance;
	private static final transient Logger logger = Logger.getLogger(StoreManager.class);

	public static synchronized StoreManager getInstance() {
		if (instance == null)
			instance = new StoreManager();	
		return instance;
	}
	
	private StoreManager() {
		logger.debug("Store Manager Created");
	}

	public List<SaleStatus> getSaleStatuses() throws Exception {
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<SaleStatus> result = session.createQuery("from SaleStatus").list();
        session.getTransaction().commit();
		return result;
	}
	
	
}
