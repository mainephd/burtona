package com.burtona.util;

import javax.servlet.http.HttpServlet;

import com.burtona.manager.AccountManager;
import com.burtona.manager.StoreManager;
import com.burtona.manager.MemberManager;

/**
 * Servlet implementation class BuildCache
 */
public class InitializeApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitializeApplication() {
        super();
    }
    
    @Override
    public void init()
    {
    	ServiceLocator.getInstance();
    	AccountManager.getInstance();
    	MemberManager.getInstance();
    	StoreManager.getInstance();
    }
}
