package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	private int couponCode;
	private String expiry_date;

	public Coupon() {
		super();

	}

	public Coupon(int couponId, int couponCode, String expiry_date) {
		super();
		this.couponId = couponId;
		this.couponCode = couponCode;
		this.expiry_date = expiry_date;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public int getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(int couponCode) {
		this.couponCode = couponCode;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponCode=" + couponCode + ", expiry_date=" + expiry_date + "]";
	}

}
