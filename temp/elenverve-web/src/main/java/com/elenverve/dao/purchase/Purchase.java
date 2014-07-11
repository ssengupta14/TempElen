package com.elenverve.dao.purchase;

import java.util.Date;

import com.elenverve.dao.payment.Payment;
import com.elenverve.dao.personal.Customer;

public class Purchase {

		private String purchaseId;
		private Date purchaseDt;
		private Customer customer;
		private ShoppingCart shoppingcart;
		private Payment payment;
		
		public String getPurchaseId() {
			return purchaseId;
		}
		public void setPurchaseId(String purchaseId) {
			this.purchaseId = purchaseId;
		}
		public Date getPurchaseDt() {
			return purchaseDt;
		}
		public void setPurchaseDt(Date purchaseDt) {
			this.purchaseDt = purchaseDt;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public ShoppingCart getShoppingcart() {
			return shoppingcart;
		}
		public void setShoppingcart(ShoppingCart shoppingcart) {
			this.shoppingcart = shoppingcart;
		}
		public Payment getPayment() {
			return payment;
		}
		public void setPayment(Payment payment) {
			this.payment = payment;
		}
		
	
	
}
