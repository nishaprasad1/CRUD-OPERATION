package com.projectcrusoperation.rest_demo.model;

public class cloudVendor {
	
	private String vendorID;
	private String vendorName;
	private String vendorSex;
	private String vendorAge;
	private String vendorPhoneNumber;
	public cloudVendor(String vendorID, String vendorName, String vendorSex, String vendorAge,
			String vendorPhoneNumber) {
		super();
		this.vendorID = vendorID;
		this.vendorName = vendorName;
		this.vendorSex = vendorSex;
		this.vendorAge = vendorAge;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	public cloudVendor() {
		super();
	}
	public String getVendorID() {
		return vendorID;
	}
	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorSex() {
		return vendorSex;
	}
	public void setVendorSex(String vendorSex) {
		this.vendorSex = vendorSex;
	}
	public String getVendorAge() {
		return vendorAge;
	}
	public void setVendorAge(String vendorAge) {
		this.vendorAge = vendorAge;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	

}
