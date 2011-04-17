package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * CarrierStatus generated by hbm2java
 */
public class CarrierStatus implements java.io.Serializable {

	private Integer carrierStatusCode;
	private String carrierStatusDescription;
	private Date lastUpdateTs;

	public CarrierStatus() {
	}

	public CarrierStatus(String carrierStatusDescription, Date lastUpdateTs) {
		this.carrierStatusDescription = carrierStatusDescription;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getCarrierStatusCode() {
		return this.carrierStatusCode;
	}

	public void setCarrierStatusCode(Integer carrierStatusCode) {
		this.carrierStatusCode = carrierStatusCode;
	}

	public String getCarrierStatusDescription() {
		return this.carrierStatusDescription;
	}

	public void setCarrierStatusDescription(String carrierStatusDescription) {
		this.carrierStatusDescription = carrierStatusDescription;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
