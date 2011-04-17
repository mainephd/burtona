package com.burtona.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.burtona.db.model.CarrierStatus;
import com.burtona.db.model.CountryCode;
import com.burtona.db.model.SalePaymentType;
import com.burtona.util.ServiceLocator;

public class DeliveryManager {
	private static final transient Logger logger = Logger.getLogger(AccountManager.class);
	private static DeliveryManager instance;

	public static synchronized DeliveryManager getInstance() {
		if (instance == null)
			instance = new DeliveryManager();
		return instance;
	}

	private DeliveryManager() {
		logger.debug("Account Manager Created");
	}
	
	public List<CarrierStatus> getCarrierStatus() throws Exception
	{
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<CarrierStatus> result = session.createQuery("from CarrierStatus").list();
        session.getTransaction().commit();
		return result;
	}
	
	public List<CountryCode> getCountryCode() throws Exception
	{
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<CountryCode> result = session.createQuery("from CountryCode").list();
        session.getTransaction().commit();
		return result;
	}
}
