package com.aspiresys.foodstudio.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private long restaurantId;
	private String orderStatus;
	private int totalAmount;
	private int discount;
	private int shippingCharge;
	private int deliveryPersonId;
	private long delieryAddressId;
	private Date deliveryDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId", insertable = true)
	private Users users;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(int shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public int getDeliveryPersonId() {
		return deliveryPersonId;
	}

	public void setDeliveryPersonId(int deliveryPersonId) {
		this.deliveryPersonId = deliveryPersonId;
	}

	public long getDelieryAddressId() {
		return delieryAddressId;
	}

	public void setDelieryAddressId(long delieryAddressId) {
		this.delieryAddressId = delieryAddressId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Orders(long orderId, long restaurantId, String orderStatus, int totalAmount, int discount,
			int shippingCharge, int deliveryPersonId, long delieryAddressId, Date deliveryDate, Users users) {
		super();
		this.orderId = orderId;
		this.restaurantId = restaurantId;
		this.orderStatus = orderStatus;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.shippingCharge = shippingCharge;
		this.deliveryPersonId = deliveryPersonId;
		this.delieryAddressId = delieryAddressId;
		this.deliveryDate = deliveryDate;
		this.users = users;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", restaurantId=" + restaurantId + ", orderStatus=" + orderStatus
				+ ", totalAmount=" + totalAmount + ", discount=" + discount + ", shippingCharge=" + shippingCharge
				+ ", deliveryPersonId=" + deliveryPersonId + ", delieryAddressId=" + delieryAddressId
				+ ", deliveryDate=" + deliveryDate + ", users=" + users + "]";
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

}
