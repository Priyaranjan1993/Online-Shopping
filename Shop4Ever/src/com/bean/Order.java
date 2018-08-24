package com.bean;


import java.util.ArrayList;
import java.util.Date;




public class Order {

	
	private int orderId;
	private String productDetails;
	private double mrpAmount;
	private double discountAmount;
	private double rebateAmount;
	private double tax;
	private double finalAmount;
	private String orderStatus;
	private Date purchaseDate;
	private String modeOfPayment;
	private int customerId;
	private int discountId;
	private String billingAddress;
	private String billingAddressCity;
	private String deliveryAddress;
	private String deliveryAddressCity;
	private int salesExecutiveId;
	private int deliveryExecutiveId;
	private int transactionId;
	
	ArrayList<Order> orderlist=new ArrayList<Order>();
	
	
	public ArrayList<Order> getOrderlist() {
		return orderlist;
	}
	public void setOrderlist(ArrayList<Order> orderlist) {
		this.orderlist = orderlist;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public double getMrpAmount() {
		return mrpAmount;
	}
	public void setMrpAmount(double mrpAmount) {
		this.mrpAmount = mrpAmount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getRebateAmount() {
		return rebateAmount;
	}
	public void setRebateAmount(double rebateAmount) {
		this.rebateAmount = rebateAmount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingAddressCity() {
		return billingAddressCity;
	}
	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryAddressCity() {
		return deliveryAddressCity;
	}
	public void setDeliveryAddressCity(String deliveryAddressCity) {
		this.deliveryAddressCity = deliveryAddressCity;
	}
	public int getSalesExecutiveId() {
		return salesExecutiveId;
	}
	public void setSalesExecutiveId(int salesExecutiveId) {
		this.salesExecutiveId = salesExecutiveId;
	}
	public int getDeliveryExecutiveId() {
		return deliveryExecutiveId;
	}
	public void setDeliveryExecutiveId(int deliveryExecutiveId) {
		this.deliveryExecutiveId = deliveryExecutiveId;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
}