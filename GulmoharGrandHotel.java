package com;

import java.util.ArrayList;
import java.util.TreeSet;

public class GulmoharGrandHotel implements Hotel{
	private ArrayList<Room> roomList=new ArrayList<>();
	private ArrayList<Customer> custList=new ArrayList<>();
	
	public GulmoharGrandHotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addCustomer(Customer c) throws CustomerAlreadyException {
		int flag=0;
		for(int i=0;i<custList.size();i++){
			if(custList.get(i).getCustomerName().equalsIgnoreCase(c.getCustomerName()) && custList.get(i).getPassportNo().equalsIgnoreCase(c.getPassportNo())){
				flag=1;
			}
		}
		if(flag!=1){
			custList.add(c);
		}
		else
			throw new CustomerAlreadyException();
		return custList.size();
	}

	@Override
	public int addRoom(Room r){
		int flag=0;
		for(int i=0;i<roomList.size();i++){
			if(roomList.get(i).getRoomNo()==r.getRoomNo() && roomList.get(i).getRoomType().equalsIgnoreCase(r.getRoomType())){
				flag=1;
			}
		}
		if(flag!=1){
			roomList.add(r);
		}
		return roomList.size();
	}

	@Override
	public int allocateRoom(String s) {
		
		
		return 0;
	}
	
	public TreeSet<String> getDifferentPassportNos(){
		TreeSet<String> ts=new TreeSet<>();
		for(int i=0;i<custList.size();i++){
			ts.add(custList.get(i).getPassportNo());
		}
		return ts;
	}

}
