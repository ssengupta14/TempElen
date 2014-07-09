package com.elenverve.dao.social.user;

public abstract class SocialUser {

	//Add more social media
	public static int FB_USER =0;
	public static int TWITTER_USER =1;
	public static int GPLUS_USER =2;
	
	private String username;
	private int type;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
