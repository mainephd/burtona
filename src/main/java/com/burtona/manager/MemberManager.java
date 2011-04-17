package com.burtona.manager;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.burtona.db.model.MemberEducationDegreeType;
import com.burtona.db.model.MemberEducationType;
import com.burtona.db.model.MemberStatusType;
import com.burtona.util.ServiceLocator;

public class MemberManager {
	
	private static MemberManager instance;
	private static final transient Logger logger = Logger.getLogger(MemberManager.class);
	
	public static synchronized MemberManager getInstance()
	{
		if(instance == null)
			instance = new MemberManager();
		return instance;
	}
	
	private MemberManager()
	{	
		logger.debug("User Manager Created");
	}
	
	public List<MemberEducationType> getMemberEducationType() throws Exception
	{
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<MemberEducationType> result = session.createQuery("from MemberEducationType").list();
        session.getTransaction().commit();
		return result;
	}
	
	public List<MemberStatusType> getMemberStatusType() throws Exception
	{
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<MemberStatusType> result = session.createQuery("from MemberStatusType").list();
        session.getTransaction().commit();
		return result;
	}
	
	public List<MemberEducationDegreeType> getMemberEducationDegreeType() throws Exception
	{
		Session session = ServiceLocator.getInstance().getSessionFactory().getCurrentSession();
		session.beginTransaction();
        List<MemberEducationDegreeType> result = session.createQuery("from MemberEducationDegreeType").list();
        session.getTransaction().commit();
		return result;
	}
}
