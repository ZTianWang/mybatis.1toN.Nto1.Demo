package com.wnwn.po;

import java.util.List;

public class OrderInfo {

	private Integer orderId;
	private String orderName;
	private Double orderPrice;
	private UserInfo userInfo;
	public List<OrderInfo> getOrderInfo() {
		return orderInfo;
	}
	public void setOrderInfo(List<OrderInfo> orderInfo) {
		this.orderInfo = orderInfo;
	}
	private List<OrderInfo> orderInfo;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", orderName=" + orderName + ", orderPrice=" + orderPrice
				+ ", userInfo=" + userInfo + "]";
	}
}
