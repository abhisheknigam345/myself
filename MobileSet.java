package com;

public class MobileSet {
	
	private String IMEI_Code;
	private String company;
	private String model;
	private double cost;
	public MobileSet(String iMEI_Code, String company, String model, double cost) {
		super();
		IMEI_Code = iMEI_Code;
		this.company = company;
		this.model = model;
		this.cost = cost;
	}
	public String getIMEI_Code() {
		return IMEI_Code;
	}
	public void setIMEI_Code(String iMEI_Code) {
		IMEI_Code = iMEI_Code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
