package com;

import java.util.ArrayList;

public class MobileCompanyRetailer {
	
	private int retailerId;
	private String mobileCompanyName;
	private double commisionPerSt;
	ArrayList<MobileSet> ms=new ArrayList<MobileSet>();
	
	public MobileCompanyRetailer(int retailerId, String mobileCompanyName, double commisionPerSt,
			ArrayList<MobileSet> ms) {
		super();
		this.retailerId = retailerId;
		this.mobileCompanyName = mobileCompanyName;
		this.commisionPerSt = commisionPerSt;
		this.ms = ms;
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getMobileCompanyName() {
		return mobileCompanyName;
	}
	public void setMobileCompanyName(String mobileCompanyName) {
		this.mobileCompanyName = mobileCompanyName;
	}
	public double getCommisionPerSt() {
		return commisionPerSt;
	}
	public void setCommisionPerSt(double commisionPerSt) {
		this.commisionPerSt = commisionPerSt;
	}
	public ArrayList<MobileSet> getMs() {
		return ms;
	}
	public void setMs(ArrayList<MobileSet> ms) {
		this.ms = ms;
	}
	
	

}
