package com.elenverve.dao.social.product;

public class Testimonial {
	private String testimonialId;
	private String username;
	private String comments;
	private double reviewStars;
	public static String ANNONIMOUS_USER="Annonimous";
	
	public String getTestimonialId() {
		return testimonialId;
	}
	public void setTestimonialId(String testimonialId) {
		this.testimonialId = testimonialId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public double getReviewStars() {
		return reviewStars;
	}
	public void setReviewStars(double reviewStars) {
		this.reviewStars = reviewStars;
	}
	
	
}
