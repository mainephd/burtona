package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * MemberStatusType generated by hbm2java
 */
public class MemberStatusType implements java.io.Serializable {

	private Integer memberStatusCode;
	private String memberStatusCodeDescription;
	private Date lastUpdateTs;

	public MemberStatusType() {
	}

	public MemberStatusType(String memberStatusCodeDescription,
			Date lastUpdateTs) {
		this.memberStatusCodeDescription = memberStatusCodeDescription;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getMemberStatusCode() {
		return this.memberStatusCode;
	}

	public void setMemberStatusCode(Integer memberStatusCode) {
		this.memberStatusCode = memberStatusCode;
	}

	public String getMemberStatusCodeDescription() {
		return this.memberStatusCodeDescription;
	}

	public void setMemberStatusCodeDescription(
			String memberStatusCodeDescription) {
		this.memberStatusCodeDescription = memberStatusCodeDescription;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
