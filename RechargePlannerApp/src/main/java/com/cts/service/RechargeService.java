package com.cts.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import com.cts.exceptions.InvalidRechargeDateException;
import com.cts.model.CustomerDetails;
import com.cts.model.RechargePackage;


public class RechargeService {
	/**
	 * Use below list to perform operations in service methods
	 * DO NOT CHANGE THE VALUES OF LIST OF RECHARGE PACKAGES 
	 */
	private List<RechargePackage> packages;
	
	public RechargeService() {
		packages = new ArrayList<RechargePackage>();
		packages.add(new RechargePackage(1, "Airtel Rs.399 30 Days Recharge Plan", "airtel", 30, 399));
		packages.add(new RechargePackage(2, "Airtel Rs.500 45 Days Recharge Plan", "airtel", 45, 500));
		packages.add(new RechargePackage(3, "Airtel Rs.420 69 Days Recharge Plan", "airtel", 69, 420));
		packages.add(new RechargePackage(4, "Bsnl Rs.299 30 Days Recharge Plan", "bsnl", 30, 299));
		packages.add(new RechargePackage(5, "Bsnl Rs.500 60 Days Recharge Plan", "bsnl", 60, 500));
		packages.add(new RechargePackage(6, "Bsnl Rs.198 30 Days Recharge Plan", "bsnl", 30, 198));
		packages.add(new RechargePackage(7, "Cellone Rs.350 30 Days Recharge Plan", "cellone", 30, 350));
		packages.add(new RechargePackage(8, "Cellone Rs.500 45 Days Recharge Plan", "cellone", 45, 500));
		packages.add(new RechargePackage(9, "Cellone Rs.666 66 Days Recharge Plan", "cellone", 66, 666));
	}

	/**
	 * @param customerDetails
	 * @return boolean
	 * @throws InvalidRechargeDateException
	 */
	public boolean checkStatus(CustomerDetails customerDetails) {
		 //TODO add your code here
		return false;
	}
	/**
	 * @param packages
	 * @return previousSelectedPackage
	 */
	private int getValidity(List<RechargePackage> packages, String previousSelectedPackage) {
		//TODO add your code here
		return 0;
		
	}
	/**
	 * @param packages
	 * @return previousSelectedPackage
	 */
	public List<RechargePackage> getAllPackagesByPlanName(String packageName) {
		
		return null;

	}
	/**
	 * @return List
	 */
	public List<RechargePackage> getAllPackages()
	{
		return null;
	}
	/**
	 * @param carrierType
	 * @return List
	 */
	public List<RechargePackage> getAllPackages(String carrierType) {
		
		return null;
	}
	/**
	 * @return LinkedHashMap
	 */
	public LinkedHashMap<String, String> getPackageNames() {
		
		return null;
	}
	/**
	 * @param pid
	 * @return RechargePackage
	 */
	public RechargePackage getPackage(int pid) {
		
		return null;
	}

}
