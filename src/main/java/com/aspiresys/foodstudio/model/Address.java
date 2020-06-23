package com.aspiresys.foodstudio.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private String doorNo;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private long pincode;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="userId", insertable = true)
	private Users users;
	
	
	public Address(long addressId, String doorNo, String addressLine1, String addressLine2, String city, String state,
			long pincode) {
		this.addressId = addressId;
		this.doorNo = doorNo;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		//this.users = users;
	}


	public Address() {

	}


	public long getAddressId() {
		return addressId;
	}


	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}


	public String getDoorNo() {
		return doorNo;
	}


	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", doorNo=" + doorNo + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city + ", State=" + state + ", pincode=" + pincode
				+ ", users=" + users + "]";
	}
	
	

}
