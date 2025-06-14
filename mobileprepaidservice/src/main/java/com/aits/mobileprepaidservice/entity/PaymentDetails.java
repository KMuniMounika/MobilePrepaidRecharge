package com.aits.mobileprepaidservice.entity;

//import lombok.Data;

//@Data
public class PaymentDetails {

	private String method;
	private String upiId;
	private String cardNumber;
	private String bankAccount;
	
	public PaymentDetails() {
		
	}

	public PaymentDetails(String method, String upiId, String cardNumber, String bankAccount) {
		super();
		this.method = method;
		this.upiId = upiId;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
}