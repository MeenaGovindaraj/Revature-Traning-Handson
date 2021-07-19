package com.compartor.comparable;

public class Payment implements Comparable<Payment> {

	private int paymentId;
	private String paymentType;
	private int amount;
	private String status;
	
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public Payment() {
		paymentId =0;
		paymentType ="Cash";
		amount = 0;
		status = "Pending";
	}
	
	public Payment(int paymentId, String paymentType, int amount, String status) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.amount = amount;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "\nPayment : [paymentId=" + paymentId + ", paymentType=" + paymentType + ", amount=" + amount + ", status="
				+ status+"]";
	}
	@Override
	public int compareTo(Payment o) {
		if(o.getPaymentType().compareTo(this.getPaymentType())>0)
				return -1;
		else
			return 1;
	}
	
	
	
	
	
}
