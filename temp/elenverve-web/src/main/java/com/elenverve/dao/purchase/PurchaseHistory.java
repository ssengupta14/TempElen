package com.elenverve.dao.purchase;

import java.util.List;

public class PurchaseHistory {

	private long customerId;
	private List<Purchase> purchases;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public List<Purchase> getPurchases() {
		return purchases;
	}
	public void addToPurchaseHistory(Purchase purchase) {
		this.purchases.add(purchase);
	}
	
}
