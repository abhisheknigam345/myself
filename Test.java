package com;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws RetailerAlreadyExists {
		
		MobileStoreManagement msm=new MobileStoreManagement();
		
		MobileSet ms1=new MobileSet("111", "Samsung", "A101", 5000.0);
		MobileSet ms2=new MobileSet("112", "LYF", "wind1", 5500.0);
		MobileSet ms3=new MobileSet("113", "htc", "820G", 9000.0);
		
		ArrayList<MobileSet> ams1=new ArrayList<MobileSet>();
		ams1.add(ms1);
		ArrayList<MobileSet> ams2=new ArrayList<MobileSet>();

		ams2.add(ms2);
		ArrayList<MobileSet> ams3=new ArrayList<MobileSet>();

		ams3.add(ms3);
		
		ArrayList<Customer> cus=new ArrayList<Customer>();
		Customer cus1=new Customer(0011, "shubham", 9045,ams1);
		Customer cus2=new Customer(0022, "ABHISHEK", 45454,ams2);
		Customer cus3=new Customer(0033, "shyam", 23232,ams3);
		
		cus.add(cus1);
		cus.add(cus2);
		cus.add(cus3);
		
		
		ArrayList<MobileCompanyRetailer> armcr=new ArrayList<>();
		MobileCompanyRetailer armcrobj=new MobileCompanyRetailer(1, "Samsung", 200, ams1);
		
		armcr.add(armcrobj);
		
		
		
	
		
		
		ArrayList<MobileSet> mrts=new ArrayList<MobileSet>();
        
        mrts.add(ms2);
        mrts.add(ms3);
	
		
		MobileCompanyRetailer mcr=new MobileCompanyRetailer(1, "Samsung", 200, mrts);
		
		
		
		
		MobileStore obj1=new MobileStore("PKS",121,armcr,cus);
		try{
		msm.addRetailerToMobileStore(obj1, mcr);
		}catch(RetailerAlreadyExists r){
			System.out.println(r.getMessage());
		}
    //System.out.println(obj1.getRetailerList().get(0));
	}

}
