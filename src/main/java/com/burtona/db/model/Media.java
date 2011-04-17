package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * Media generated by hbm2java
 */
public class Media implements java.io.Serializable {

	private Long mediaId;
	private String mediaLocation;
	private int mediaType;
	private long uploadMemberId;
	private Date lastUpdateTs;

	public Media() {
	}

	public Media(String mediaLocation, int mediaType, long uploadMemberId,
			Date lastUpdateTs) {
		this.mediaLocation = mediaLocation;
		this.mediaType = mediaType;
		this.uploadMemberId = uploadMemberId;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Long getMediaId() {
		return this.mediaId;
	}

	public void setMediaId(Long mediaId) {
		this.mediaId = mediaId;
	}

	public String getMediaLocation() {
		return this.mediaLocation;
	}

	public void setMediaLocation(String mediaLocation) {
		this.mediaLocation = mediaLocation;
	}

	public int getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(int mediaType) {
		this.mediaType = mediaType;
	}

	public long getUploadMemberId() {
		return this.uploadMemberId;
	}

	public void setUploadMemberId(long uploadMemberId) {
		this.uploadMemberId = uploadMemberId;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}