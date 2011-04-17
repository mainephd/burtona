package com.burtona.services;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.burtona.db.model.SaleStatus;
import com.burtona.manager.StoreManager;
import com.burtona.util.Utility;

@Path("/store")
public class StoreService {
	
	private static final transient Logger logger = Logger.getLogger(StoreService.class);
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("album")
	public Object getAlbums()
	{
		try {			
			return null;
		} catch (Exception e) {
			logger.error("Album Retrieval Failed");
			return null;
		}		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("salestatus")
	public Object getSaleStatusesXML(){
		try
		{
			List<SaleStatus> status = StoreManager.getInstance().getSaleStatuses();
			return Utility.toXml(status);
		}
		catch(Exception e)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			return sw.toString();
		}	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("salestatus")
	public Object getSaleStatusesJSON(){
		try
		{
			List<SaleStatus> status = StoreManager.getInstance().getSaleStatuses();
			return Utility.toJson(status);
		}
		catch(Exception e)
		{
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			return sw.toString();
		}	
	}	
	
}
