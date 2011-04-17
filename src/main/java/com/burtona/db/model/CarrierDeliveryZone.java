package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * CarrierDeliveryZone generated by hbm2java
 */
public class CarrierDeliveryZone implements java.io.Serializable {

	private Integer carrierDeliveryZoneId;
	private int carrierId;
	private String stateCode;
	private String zipCode;
	private int countryId;
	private Date lastUpdateTs;

	public CarrierDeliveryZone() {
	}

	public CarrierDeliveryZone(int carrierId, String stateCode, String zipCode,
			int countryId, Date lastUpdateTs) {
		this.carrierId = carrierId;
		this.stateCode = stateCode;
		this.zipCode = zipCode;
		this.countryId = countryId;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Integer getCarrierDeliveryZoneId() {
		return this.carrierDeliveryZoneId;
	}

	public void setCarrierDeliveryZoneId(Integer carrierDeliveryZoneId) {
		this.carrierDeliveryZoneId = carrierDeliveryZoneId;
	}

	public int getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(int carrierId) {
		this.carrierId = carrierId;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
