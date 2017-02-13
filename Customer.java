package com;

import java.util.ArrayList;

public class Customer {
	
	private int customerId;
	private String name;
	private double phoneNo;
	private ArrayList<MobileSet> purchasedPhone=new ArrayList<MobileSet>();
	public Customer(int customerId, String name, double phoneNo, ArrayList<MobileSet> purchasedPhone) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.purchasedPhone = purchasedPhone;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public ArrayList<MobileSet> getPurchasedPhone() {
		return purchasedPhone;
	}
	public void setPurchasedPhone(ArrayList<MobileSet> purchasedPhone) {
		this.purchasedPhone = purchasedPhone;
	}
	
	

}
