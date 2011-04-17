package com.burtona.services;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.burtona.db.model.MemberEducationDegreeType;
import com.burtona.db.model.MemberEducationType;
import com.burtona.db.model.MemberStatusType;
import com.burtona.manager.MemberManager;
import com.burtona.util.Utility;

@Path("/member")
public class AccountService {
private static final transient Logger logger = Logger.getLogger(StoreService.class);
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("degreetype")
	public Object getMemberEducationDegreeTypeXML(){
		try
		{
			List<MemberEducationDegreeType> status = MemberManager.getInstance().getMemberEducationDegreeType();
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
	@Produces(MediaType.APPLICATION_XML)
	@Path("educationtype")
	public Object getMemberEducationTypeXML(){
		try
		{
			List<MemberEducationType> status = MemberManager.getInstance().getMemberEducationType();
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
	@Produces(MediaType.APPLICATION_XML)
	@Path("memberstatus")
	public Object getMemberStatusTypeXML(){
		try
		{
			List<MemberStatusType> status = MemberManager.getInstance().getMemberStatusType();
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
	@Path("degreetype")
	public Object getMemberEducationDegreeTypeJSON(){
		try
		{
			List<MemberEducationDegreeType> status = MemberManager.getInstance().getMemberEducationDegreeType();
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
	@Produces(MediaType.APPLICATION_JSON)
	@Path("educationtype")
	public Object getMemberEducationTypeJSON(){
		try
		{
			List<MemberEducationType> status = MemberManager.getInstance().getMemberEducationType();
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
	@Produces(MediaType.APPLICATION_JSON)
	@Path("memberstatus")
	public Object getMemberStatusTypeJSON(){
		try
		{
			List<MemberStatusType> status = MemberManager.getInstance().getMemberStatusType();
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
