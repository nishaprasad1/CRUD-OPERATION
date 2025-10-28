package com.projectcrusoperation.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectcrusoperation.rest_demo.model.cloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorAPIService {
	
	cloudVendor cloudvendor;
	
	@GetMapping("/{vendorID}")//get method
	public cloudVendor getCloudVendorDetials( @PathVariable String vendorID) {
		
		return cloudvendor;
//				new cloudVendor("C1","Nisha","Female","30","8369");
	}

	@PostMapping//create a new data and pu it into data base.
	public String createCloudVendorDetials(@RequestBody cloudVendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return "Cloud Vendor Created Sucessfully";
	}
	
	
	
	@PutMapping//to update a existing data.
	public String updateCloudVendorDetials(@RequestBody cloudVendor cloudvendor) {
		this.cloudvendor=cloudvendor;
		return "Cloud Vendor Updated Sucessfully";
	}
	
	@DeleteMapping("/{vendorID}")
	public String DeleteCloudVendorDetials(String vendorID) {
		this.cloudvendor=null;
		return "Cloud Vendor Deleted Sucessfully";
	}
	
	
}
