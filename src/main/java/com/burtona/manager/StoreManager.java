package com.burtona.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.burtona.db.model.AlbumApprovalStatus;
import com.burtona.db.model.SaleItemType;
import com.burtona.db.model.SalePaymentType;
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

	public List<SaleItemType> getSaleItemTypes() throws Exception {
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<SaleItemType> result = session.createQuery("from SaleItemType").list();
        session.getTransaction().commit();
		return result;
	}
	
	public List<AlbumApprovalStatus> getAlbumApprovalStatus() throws Exception {
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<AlbumApprovalStatus> result = session.createQuery("from AlbumApprovalStatus").list();
        session.getTransaction().commit();
		return result;
	}
	
	public List<SalePaymentType> getSalePaymentType() throws Exception {
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<SalePaymentType> result = session.createQuery("from SalePaymentType").list();
        session.getTransaction().commit();
		return result;
	}
	
	
}
