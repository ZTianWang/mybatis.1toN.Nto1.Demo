package com.wnwn.po;

import java.util.List;

/*用户信息的实体类*/
public class UserInfo {

	private Integer userId;
	private String userName;
	private String userSex;
	private List<OrderInfo> orderList;
	
	public List<OrderInfo> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderInfo> orderList) {
		this.orderList = orderList;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", userSex=" + userSex + "]";
	}
}
