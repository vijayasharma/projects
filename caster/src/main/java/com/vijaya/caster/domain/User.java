package com.vijaya.caster.domain;

public class User {

	private String userName;
	private String password;
	private int enabled;
	
	public User() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", enabled=" + enabled + "]";
	}
	
}
