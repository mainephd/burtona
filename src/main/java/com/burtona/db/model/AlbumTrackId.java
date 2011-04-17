package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

/**
 * AlbumTrackId generated by hbm2java
 */
public class AlbumTrackId implements java.io.Serializable {

	private long albumId;
	private int trackId;

	public AlbumTrackId() {
	}

	public AlbumTrackId(long albumId, int trackId) {
		this.albumId = albumId;
		this.trackId = trackId;
	}

	public long getAlbumId() {
		return this.albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AlbumTrackId))
			return false;
		AlbumTrackId castOther = (AlbumTrackId) other;

		return (this.getAlbumId() == castOther.getAlbumId())
				&& (this.getTrackId() == castOther.getTrackId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getAlbumId();
		result = 37 * result + this.getTrackId();
		return result;
	}

}
