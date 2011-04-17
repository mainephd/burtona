package com.burtona.manager;

import org.apache.log4j.Logger;

public class AccountManager {
   private static final transient Logger logger = Logger.getLogger(AccountManager.class);
   private static AccountManager instance;
   
   public static synchronized AccountManager getInstance()
   {
	   if(instance == null)
		  instance = new AccountManager();
	   return instance;
   }
   
   private AccountManager()
   {
	   logger.debug("Account Manager Created");
   }
   
   
   
}
