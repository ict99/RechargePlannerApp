package com.cts.model;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.cts.service.RechargeService;

public class CustomerDetails {
	///DO NOT CHANGE THE VARIABLE NAMES OR DATA TYPES OR ACCESS SPECIFIERS
	private String name;
	private String mobileNo;
	private String carrier;
	private Date previousRechargeDate;
	private String previousSelectedPackage;
	private LinkedHashMap<String, String> packageNames;
	private RechargeService service=new RechargeService();
	public CustomerDetails() {
		this.setPackageNames(service.getPackageNames());
	}
	
	public CustomerDetails(String name, String mobileNo, String carrier, Date previousRechargeDate,
			String previousSelectedPackage) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.carrier = carrier;
		this.previousRechargeDate = previousRechargeDate;
		this.previousSelectedPackage = previousSelectedPackage;
	}
	//generate getters and setters here
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public Date getPreviousRechargeDate() {
		return previousRechargeDate;
	}
	public void setPreviousRechargeDate(Date previousRechargeDate) {
		this.previousRechargeDate = previousRechargeDate;
	}
	public String getPreviousSelectedPackage() {
		return previousSelectedPackage;
	}
	public void setPreviousSelectedPackage(String previousSelectedPackage) {
		this.previousSelectedPackage = previousSelectedPackage;
	}
	public LinkedHashMap<String, String> getPackageNames() {
		return packageNames;
	}
	public void setPackageNames(LinkedHashMap<String, String> packageNames) {
		this.packageNames = packageNames;
	}
	
	
}
