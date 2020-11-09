package com;

public class Address {

	public Address(int doorNo, String state, String city) {
		super();
		this.doorNo = doorNo;
		this.state = state;
		this.city = city;
	}

	public Address() {
		this.doorNo = 100;
		this.city = "New Delhi";
		this.state = "Delhi";
	}

	private int doorNo;
	private String state;
	private String city;

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
