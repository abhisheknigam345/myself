package com;

public class MobileStoreManagement {
	
	public void addRetailerToMobileStore(MobileStore store,MobileCompanyRetailer retailer)throws RetailerAlreadyExists
	{
	
		for(int i=0;i<store.getRetailerList().size();i++){
			if(store.getRetailerList().get(i).getRetailerId()==retailer.getRetailerId()){
				//System.out.println(store.getRetailerList().get(0).getRetailerId());
				throw new RetailerAlreadyExists();
				}
			else
			{
				store.getRetailerList().add(retailer);
				
			}
		}
		
		
	}

}
