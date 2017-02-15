package com.fis.filter;

public class User {
	String userName;
	String userAccount;
	String userPwd;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public User(String userName, String userAccount, String userPwd) {
		super();
		this.userName = userName;
		this.userAccount = userAccount;
		this.userPwd = userPwd;
	}
	
}
