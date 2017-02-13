package com;

import java.util.ArrayList;

public class MobileStore {
	
	private String storeName;
	private int storeId;
	private ArrayList<MobileCompanyRetailer> retailerList=new ArrayList<MobileCompanyRetailer>();
	private ArrayList<Customer> customerList=new ArrayList<Customer>();
	public MobileStore(String storeName, int storeId, ArrayList<MobileCompanyRetailer> retailerList,
			ArrayList<Customer> customerList) {
		super();
		this.storeName = storeName;
		this.storeId = storeId;
		this.retailerList = retailerList;
		this.customerList = customerList;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public ArrayList<MobileCompanyRetailer> getRetailerList() {
		return retailerList;
	}
	public void setRetailerList(ArrayList<MobileCompanyRetailer> retailerList) {
		this.retailerList = retailerList;
	}
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	

}
