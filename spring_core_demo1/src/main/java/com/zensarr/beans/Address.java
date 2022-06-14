package com.zensarr.beans;

public class Address {
	private String State;
	private String City;
	private int Pincode;
	public Address() {
		super();
	}
	public Address(String state, String city, int pincode) {
		super();
		State = state;
		City = city;
		Pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [State=" + State + ", City=" + City + ", Pincode=" + Pincode + "]";
	}
	
	

}
