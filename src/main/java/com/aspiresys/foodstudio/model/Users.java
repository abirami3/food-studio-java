package com.aspiresys.foodstudio.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="userId")
	private long userId;
	private String name;
	private String email;
	private String mobileNo;
//	@OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name="cartId")
	private int cartId;
	// private int addressId;
	//private int orderId;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Login login;

	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Address> address ;
	//= new ArrayList<Address>();
	
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Orders> orders = new ArrayList<Orders>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public Users(long userId, String name, String email, String mobileNo, int cartId, List<Orders> orders, Login login,
			List<Address> address) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.cartId = cartId;
	//	this.orders = orders;
		//this.login = login;
		//this.address = address;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrderId(List<Orders> orders) {
		this.orders = orders;
	}

	public Users() {

	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", cartId="
				+ cartId + ", orderId=" + orders + ", login=" + login + "]";
	}

}
