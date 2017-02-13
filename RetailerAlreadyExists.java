package com;

public class RetailerAlreadyExists extends Exception{
	
	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return "Retailer already exist";
	}
	
	

}
