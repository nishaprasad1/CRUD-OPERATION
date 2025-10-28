package com.thinkcon.rest_demo2.controller;

import com.thinkcon.rest_demo2.service.CloudVendorService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkcon.rest_demo2.model.cloudVendor;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorController {

    public cloudVendorController(CloudVendorService cloudVendorService) {
        CloudVendorService = cloudVendorService;
    }

    CloudVendorService CloudVendorService;
     //Read Specific Cloud Vendor Details
    @GetMapping("/{vendorID}")//get method
    public cloudVendor getCloudVendorDetials(@PathVariable("vendorID") String vendorID) {
        return CloudVendorService.getCloudVendor(vendorID);

//				new cloudVendor("C1","Nisha","Female","30","8369");
    }
    //Read ALl Cloud Vendor Details
    @GetMapping()//get method
    public List<cloudVendor> getALLCloudVendorDetials(@PathVariable("vendorID") String vendorID) {
        return CloudVendorService.getAllCloudVendor();

//				new cloudVendor("C1","Nisha","Female","30","8369");
    }

    @PostMapping//create a new data and put it into data base.
    public String createCloudVendorDetials(@RequestBody cloudVendor cloudvendor) {
        CloudVendorService.createCloudVendor(cloudvendor);
        return "Cloud Vendor Created Sucessfully";
    }


    @PutMapping//to update a existing data.
    public String updateCloudVendorDetials(@RequestBody cloudVendor cloudvendor) {
        CloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloud Vendor Updated Sucessfully";
    }

    @DeleteMapping("/{vendorID}")
    public String DeleteCloudVendorDetials(@PathVariable String vendorID) {
        CloudVendorService.deleteCloudVendor(vendorID);
        return "Cloud Vendor Deleted Sucessfully";
    }


}

