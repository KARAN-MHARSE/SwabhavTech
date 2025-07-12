package com.aurionpro.foodify.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private UUID orderId;
    private UUID customerId;
    private double totalAmount;
    private double discountAmount;
    private double finalAmount;
    private boolean isPaid;
    private UUID paymentId;
    private LocalDate createdAt;
    
    
    
	public Invoice(UUID orderId, UUID customerId, double totalAmount, double discountAmount, double finalAmount,
			boolean isPaid, UUID paymentId) {
		this.id = UUID.randomUUID();
		this.orderId = orderId;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
		this.discountAmount = discountAmount;
		this.finalAmount = finalAmount;
		this.isPaid = isPaid;
		this.paymentId = paymentId;
		this.createdAt = LocalDate.now();
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getOrderId() {
		return orderId;
	}
	public void setOrderId(UUID orderId) {
		this.orderId = orderId;
	}
	public UUID getCustomerId() {
		return customerId;
	}
	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public UUID getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(UUID paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", orderId=" + orderId + ", customerId=" + customerId + ", totalAmount="
				+ totalAmount + ", discountAmount=" + discountAmount + ", finalAmount=" + finalAmount + ", isPaid="
				+ isPaid + ", paymentId=" + paymentId + ", createdAt=" + createdAt + "]";
	}
    
    

}
