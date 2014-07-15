package com.elenverve.dvo.personal;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
	
	
	private FraudCheck fraudCheck;
	private List<ShippingAddress> shipingAddresses = new ArrayList<ShippingAddress>();
	private BillingAddress billingAddress;
	
	public FraudCheck getFraudCheck() {
		return fraudCheck;
	}
	public void setFraudCheck(FraudCheck fraudCheck) {
		this.fraudCheck = fraudCheck;
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
