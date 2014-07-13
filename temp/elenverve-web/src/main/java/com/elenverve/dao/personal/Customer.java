package com.elenverve.dao.personal;

public class Customer {
	private long customerId;
	private long accountId;
	private String firstName;
	private String lastName;
	private int gender;
	private ContactDetails contacts;
	private Credentials credentials;
	private FraudCheck fraudCheck;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public ContactDetails getContacts() {
		return contacts;
	}
	public void setContacts(ContactDetails contacts) {
		this.contacts = contacts;
	}
	public Credentials getCredentials() {
		return credentials;
	}
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	public FraudCheck getFraudCheck() {
		return fraudCheck;
	}
	public void setFraudCheck(FraudCheck fraudCheck) {
		this.fraudCheck = fraudCheck;
	}

}
