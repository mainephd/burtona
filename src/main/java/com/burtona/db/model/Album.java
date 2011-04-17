package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * Album generated by hbm2java
 */
public class Album implements java.io.Serializable {

	private Long albumId;
	private String albumTitle;
	private Date releaseDate;
	private long artistId;
	private int labelId;
	private BigDecimal price;
	private int trackCount;
	private int userRating;
	private int genreId;
	private String artWorkLocation;
	private int itemTypeId;
	private int albumApprovalStatus;
	private Date lastUpdateTs;

	public Album() {
	}

	public Album(String albumTitle, Date releaseDate, long artistId,
			int labelId, BigDecimal price, int trackCount, int userRating,
			int genreId, String artWorkLocation, int itemTypeId,
			int albumApprovalStatus, Date lastUpdateTs) {
		this.albumTitle = albumTitle;
		this.releaseDate = releaseDate;
		this.artistId = artistId;
		this.labelId = labelId;
		this.price = price;
		this.trackCount = trackCount;
		this.userRating = userRating;
		this.genreId = genreId;
		this.artWorkLocation = artWorkLocation;
		this.itemTypeId = itemTypeId;
		this.albumApprovalStatus = albumApprovalStatus;
		this.lastUpdateTs = lastUpdateTs;
	}

	public Long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getAlbumTitle() {
		return this.albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getArtistId() {
		return this.artistId;
	}

	public void setArtistId(long artistId) {
		this.artistId = artistId;
	}

	public int getLabelId() {
		return this.labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getTrackCount() {
		return this.trackCount;
	}

	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}

	public int getUserRating() {
		return this.userRating;
	}

	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}

	public int getGenreId() {
		return this.genreId;
	}

	public void setGenreId(int genreId) {
		this.genreId = genreId;
	}

	public String getArtWorkLocation() {
		return this.artWorkLocation;
	}

	public void setArtWorkLocation(String artWorkLocation) {
		this.artWorkLocation = artWorkLocation;
	}

	public int getItemTypeId() {
		return this.itemTypeId;
	}

	public void setItemTypeId(int itemTypeId) {
		this.itemTypeId = itemTypeId;
	}

	public int getAlbumApprovalStatus() {
		return this.albumApprovalStatus;
	}

	public void setAlbumApprovalStatus(int albumApprovalStatus) {
		this.albumApprovalStatus = albumApprovalStatus;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

}
