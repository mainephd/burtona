package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * AlbumComment generated by hbm2java
 */
public class AlbumComment implements java.io.Serializable {

	private Long albumCommentId;
	private long albumId;
	private long memberId;
	private String comment;
	private Date lastUpdateTs;

	public AlbumComment() {
	}

	public AlbumComment(long albumId, long memberId, String comment,
			Date lastUpdateTs) {
		this.albumId = albumId;
		this.memberId = memberId;
		this.comment = comment;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Long getAlbumCommentId() {
		return this.albumCommentId;
	}

	public void setAlbumCommentId(Long albumCommentId) {
		this.albumCommentId = albumCommentId;
	}

	public long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
