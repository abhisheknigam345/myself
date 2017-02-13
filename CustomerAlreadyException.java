package com;

public class CustomerAlreadyException extends Exception {
	
	public String getMessage(){
		return "Customer Already Exist";
	}

}
