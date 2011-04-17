package com.burtona.manager;

import org.apache.log4j.Logger;

public class UserManager {
	
	private static UserManager instance;
	private static final transient Logger logger = Logger.getLogger(UserManager.class);
	
	public static synchronized UserManager getInstance()
	{
		if(instance == null)
			instance = new UserManager();
		return instance;
	}
	
	private UserManager()
	{	
		logger.debug("User Manager Created");
	}
}
