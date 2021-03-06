package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.util.Date;

/**
 * Member generated by hbm2java
 */
public class Member implements java.io.Serializable {

	private Long memberId;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String profileAddress;
	private int points;
	private int memberStatusType;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private Integer countryCode;
	private Date lastUpdateTs;

	public Member() {
	}

	public Member(String firstName, String lastName, Date birthDate,
			String profileAddress, int points, int memberStatusType,
			String address, Date lastUpdateTs) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.profileAddress = profileAddress;
		this.points = points;
		this.memberStatusType = memberStatusType;
		this.address = address;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Member(String firstName, String lastName, Date birthDate,
			String profileAddress, int points, int memberStatusType,
			String address, String city, String state, String postalCode,
			Integer countryCode, Date lastUpdateTs) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.profileAddress = profileAddress;
		this.points = points;
		this.memberStatusType = memberStatusType;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.countryCode = countryCode;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfileAddress() {
		return this.profileAddress;
	}

	public void setProfileAddress(String profileAddress) {
		this.profileAddress = profileAddress;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getMemberStatusType() {
		return this.memberStatusType;
	}

	public void setMemberStatusType(int memberStatusType) {
		this.memberStatusType = memberStatusType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
