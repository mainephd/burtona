package com.burtona.util;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ServiceLocator {
	private static ServiceLocator instance = null;
	private SessionFactory sessionFactory;
	private DataSource datasource;
	private String JNDI_NAME = "java:comp/env/jdbc/BurtonaDB";
	private static final transient Logger logger = Logger.getLogger(ServiceLocator.class);

	public static synchronized ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	private ServiceLocator() {
//		try {
//			Context context = new InitialContext();
//			datasource = (DataSource) context.lookup(JNDI_NAME);
//		} catch (NamingException ne) {
//			logger.error("Unable to lookup datasource. ", ne);
//		}		
		try{
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception ne) {
			ne.printStackTrace();
			logger.error("Unable to create session factory. ", ne);
		}		
	}

//	public Connection getDBConnection() throws SQLException {
//		Connection conn = null;
//		try {
//			conn = datasource.getConnection();
//		} catch (SQLException sqlex) {
//			logger.error("Unable to open a database connection. ", sqlex);
//			throw sqlex;
//		}
//		return conn;
//	}

//	public static void closeAll(ResultSet rs, Statement st, Connection conn) {
//		try {
//			if (rs != null) {
//				rs.close();
//				rs = null;
//			}
//		} catch (Exception ex) {
//			logger.error("closeAll With ResultSet", ex);
//		}
//		try {
//			if (st != null) {
//				st.close();
//				st = null;
//			}
//		} catch (Exception ex) {
//			logger.error("closeAll With Statement", ex);
//		}
//		try {
//			if (conn != null) {
//				conn.close();
//				conn = null;
//			}
//		} catch (Exception ex) {
//			logger.error("closeAll With Connection", ex);
//		}
//	}
			
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;	
	}
}
