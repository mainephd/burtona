package com.burtona.services;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.burtona.db.model.AlbumApprovalStatus;
import com.burtona.db.model.CarrierStatus;
import com.burtona.db.model.CountryCode;
import com.burtona.db.model.SaleItemType;
import com.burtona.db.model.SalePaymentType;
import com.burtona.db.model.SaleStatus;
import com.burtona.manager.DeliveryManager;
import com.burtona.manager.StoreManager;
import com.burtona.util.Utility;

@Path("/store")
public class StoreService {
	
	private static final transient Logger logger = Logger.getLogger(StoreService.class);
	
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("saleitemtype")
	public Object getSaleItemTypeXML(){
		try
		{
			List<SaleItemType> status = StoreManager.getInstance().getSaleItemTypes();
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
	@Path("saleitemtype")
	public Object getSaleItemTypeJSON(){
		try
		{
			List<SaleItemType> status = StoreManager.getInstance().getSaleItemTypes();
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("albumstatus")
	public Object getAlbumApprovalStatusXML(){
		try
		{
			List<AlbumApprovalStatus> status = StoreManager.getInstance().getAlbumApprovalStatus();
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
	@Path("albumstatus")
	public Object getAlbumApprovalStatusJSON(){
		try
		{
			List<AlbumApprovalStatus> status = StoreManager.getInstance().getAlbumApprovalStatus();
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("paymenttype")
	public Object getSalePaymentTypeXML(){
		try
		{
			List<SalePaymentType> status = StoreManager.getInstance().getSalePaymentType();
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
	@Path("paymenttype")
	public Object getSalePaymentTypeJSON(){
		try
		{
			List<SalePaymentType> status = StoreManager.getInstance().getSalePaymentType();
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("carrierstatus")
	public Object getCarrierStatusXML(){
		try
		{
			List<CarrierStatus> status = DeliveryManager.getInstance().getCarrierStatus();
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
	@Path("carrierstatus")
	public Object getCarrierStatusJSON(){
		try
		{
			List<CarrierStatus> status = DeliveryManager.getInstance().getCarrierStatus();
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
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("countrycode")
	public Object getCountryCodeXML(){
		try
		{
			List<CarrierStatus> status = DeliveryManager.getInstance().getCarrierStatus();
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
	@Path("countrycode")
	public Object getCountryCodeJSON(){
		try
		{
			List<CountryCode> status = DeliveryManager.getInstance().getCountryCode();
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
