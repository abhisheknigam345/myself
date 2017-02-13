package com;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Customer c1=new Customer("A", 25, "LKO123");
		Customer c2=new Customer("B", 26, "LKO456");
		Customer c3=new Customer("C", 27, "LKO789");
		Customer c4=new Customer("A", 26, "LKO121");
			
		GulmoharGrandHotel ggh=new GulmoharGrandHotel();
		
		int i=0;
		try {
			i=ggh.addCustomer(c1);
			i=ggh.addCustomer(c2);
			i=ggh.addCustomer(c3);
			i=ggh.addCustomer(c4);
			System.out.println(i);
		} catch (CustomerAlreadyException e) {
			System.out.println(e.getMessage());
		}
			
		Room r1=new Room(101, "AC");
		Room r2=new Room(102, "NonAC");
		Room r3=new Room(103, "Ac");
		Room r4=new Room(101, "AC");
		
		int t=0;
		t=ggh.addRoom(r1);
		t=ggh.addRoom(r2);
		t=ggh.addRoom(r3);
		t=ggh.addRoom(r4);
		System.out.println(t);
		
		TreeSet<String> th=new TreeSet<>();
		th=ggh.getDifferentPassportNos();
			System.out.println(th);
		

	}

}
