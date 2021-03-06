package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * MemberEducationType generated by hbm2java
 */
public class MemberEducationType implements java.io.Serializable {

	private Integer educationTypeCode;
	private String educationTypeDescription;
	private Date lastUpdateTs;

	public MemberEducationType() {
	}

	public MemberEducationType(String educationTypeDescription,
			Date lastUpdateTs) {
		this.educationTypeDescription = educationTypeDescription;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getEducationTypeCode() {
		return this.educationTypeCode;
	}

	public void setEducationTypeCode(Integer educationTypeCode) {
		this.educationTypeCode = educationTypeCode;
	}

	public String getEducationTypeDescription() {
		return this.educationTypeDescription;
	}

	public void setEducationTypeDescription(String educationTypeDescription) {
		this.educationTypeDescription = educationTypeDescription;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
