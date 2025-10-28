package com.thinkcon.rest_demo2.service;

import com.thinkcon.rest_demo2.model.cloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(cloudVendor cloudVendor);
    public String updateCloudVendor(cloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorID);
    public cloudVendor getCloudVendor(String cloudVendorID);
    public List<cloudVendor> getAllCloudVendor();
}
