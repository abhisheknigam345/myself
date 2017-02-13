package com;

public interface Hotel {
	
	public int addCustomer(Customer c) throws CustomerAlreadyException;
	
	public int addRoom(Room r);
	
	public int allocateRoom(String s);

}
