package com.elenverve.dao.social.product;

import java.util.List;

public class SocialProduct {
	private String socialProductId;
	private long fbLikesCtr;
	private long fbShareCtr;
	private long tweetsCtr;
	private long recomendationCtr;
	private long dislikeCtr;
	private List<Testimonial> testimonials;
	public String getSocialProductId() {
		return socialProductId;
	}
	public void setSocialProductId(String socialProductId) {
		this.socialProductId = socialProductId;
	}
	public long getFbLikesCtr() {
		return fbLikesCtr;
	}
	public void setFbLikesCtr(long fbLikesCtr) {
		this.fbLikesCtr = fbLikesCtr;
	}
	public long getFbShareCtr() {
		return fbShareCtr;
	}
	public void setFbShareCtr(long fbShareCtr) {
		this.fbShareCtr = fbShareCtr;
	}
	public long getTweetsCtr() {
		return tweetsCtr;
	}
	public void setTweetsCtr(long tweetsCtr) {
		this.tweetsCtr = tweetsCtr;
	}
	public long getRecomendationCtr() {
		return recomendationCtr;
	}
	public void setRecomendationCtr(long recomendationCtr) {
		this.recomendationCtr = recomendationCtr;
	}
	public long getDislikeCtr() {
		return dislikeCtr;
	}
	public void setDislikeCtr(long dislikeCtr) {
		this.dislikeCtr = dislikeCtr;
	}
	public List<Testimonial> getTestimonials() {
		return testimonials;
	}
	public void setTestimonials(List<Testimonial> testimonials) {
		this.testimonials = testimonials;
	}
	
}
