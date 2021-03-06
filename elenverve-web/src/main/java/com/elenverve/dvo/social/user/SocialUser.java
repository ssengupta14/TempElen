package com.elenverve.dvo.social.user;

public abstract class SocialUser {

	
	private String username;
	
	private int type = Integer.MIN_VALUE;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public int getType() {
		return type;
	}

	protected void setType(int type) {
		this.type = type;
	}
	
}
