package com.burtona.db.model;

// Generated Apr 17, 2011 3:58:52 PM by Hibernate Tools 3.3.0.GA

/**
 * SaleItemId generated by hbm2java
 */
public class SaleItemId implements java.io.Serializable {

	private long saleId;
	private long itemId;

	public SaleItemId() {
	}

	public SaleItemId(long saleId, long itemId) {
		this.saleId = saleId;
		this.itemId = itemId;
	}

	public long getSaleId() {
		return this.saleId;
	}

	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}

	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SaleItemId))
			return false;
		SaleItemId castOther = (SaleItemId) other;

		return (this.getSaleId() == castOther.getSaleId())
				&& (this.getItemId() == castOther.getItemId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getSaleId();
		result = 37 * result + (int) this.getItemId();
		return result;
	}

}