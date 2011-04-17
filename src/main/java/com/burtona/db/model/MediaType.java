package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * MediaType generated by hbm2java
 */
public class MediaType implements java.io.Serializable {

	private Integer mediaTypeCode;
	private String mediaTypeDescription;
	private Date lastUpdateTs;

	public MediaType() {
	}

	public MediaType(String mediaTypeDescription, Date lastUpdateTs) {
		this.mediaTypeDescription = mediaTypeDescription;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getMediaTypeCode() {
		return this.mediaTypeCode;
	}

	public void setMediaTypeCode(Integer mediaTypeCode) {
		this.mediaTypeCode = mediaTypeCode;
	}

	public String getMediaTypeDescription() {
		return this.mediaTypeDescription;
	}

	public void setMediaTypeDescription(String mediaTypeDescription) {
		this.mediaTypeDescription = mediaTypeDescription;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
