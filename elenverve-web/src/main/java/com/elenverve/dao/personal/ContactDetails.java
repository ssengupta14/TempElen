package com.elenverve.dao.personal;

import java.util.List;

public class ContactDetails {
	private String phoneNumber;
	private int phoneType;
	private String emailId;
	private List<ShippingAddress> shipingAddresses;
	private BillingAddress billingAddress;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public List<ShippingAddress> getShipingAddresses() {
		return shipingAddresses;
	}
	public void addShipingAddress(ShippingAddress shipingAddress) {
		this.shipingAddresses.add(shipingAddress);
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	
}
