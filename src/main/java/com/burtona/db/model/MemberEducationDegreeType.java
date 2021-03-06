package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * MemberEducationDegreeType generated by hbm2java
 */
public class MemberEducationDegreeType implements java.io.Serializable {

	private Integer degreeType;
	private String degreeTypeDescription;
	private Date lastUpdateTs;

	public MemberEducationDegreeType() {
	}

	public MemberEducationDegreeType(String degreeTypeDescription,
			Date lastUpdateTs) {
		this.degreeTypeDescription = degreeTypeDescription;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getDegreeType() {
		return this.degreeType;
	}

	public void setDegreeType(Integer degreeType) {
		this.degreeType = degreeType;
	}

	public String getDegreeTypeDescription() {
		return this.degreeTypeDescription;
	}

	public void setDegreeTypeDescription(String degreeTypeDescription) {
		this.degreeTypeDescription = degreeTypeDescription;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
