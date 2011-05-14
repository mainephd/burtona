package com.burtona.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.burtona.bl.FrontPageContent;
import com.burtona.manager.FrontPageManager;
import com.burtona.util.Utility;

@Path("home")
public class FrontPageService {

	private static transient final Logger logger = Logger
			.getLogger(FrontPageService.class);

	@Path("content")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPageContent(@QueryParam("jsoncallback") String jsoncallback,
			@DefaultValue("1") @QueryParam("version") int version) {
		String result = "";
		try {
			switch (version) {
				case 1:
					FrontPageContent content = FrontPageManager.getInstance().getContent();
					result = (jsoncallback != null ? (jsoncallback + "(") : "") + Utility.toJson(content) + (jsoncallback != null ? (")") : "");
					break;
				default:
					break;
			}
		} catch (Exception e) {
			logger.error("Error While Retrieving front page content", e);
			result = "";
		}
		return result;
	}
	
}
