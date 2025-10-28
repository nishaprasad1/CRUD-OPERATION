package com.thinkcon.rest_demo2.service.impl;

import com.thinkcon.rest_demo2.model.cloudVendor;
import com.thinkcon.rest_demo2.repository.CloudVendorRespository;
import com.thinkcon.rest_demo2.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRespository CloudVendorRespository;

    public CloudVendorServiceImpl(CloudVendorRespository cloudVendorRespository) {
        CloudVendorRespository = cloudVendorRespository;
    }




    @Override
    public String createCloudVendor(cloudVendor cloudVendor) {
        CloudVendorRespository.save(cloudVendor);
        return "Sucess";
    }

    @Override
    public String updateCloudVendor(cloudVendor cloudVendor) {
        //More business logic
        CloudVendorRespository.save(cloudVendor);
        return "Sucessfully update";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorID) {
        CloudVendorRespository.deleteById(cloudVendorID);
        return "Sucess deleted";
    }

    @Override
    public cloudVendor getCloudVendor(String cloudVendorID) {

        return CloudVendorRespository.findById(cloudVendorID).get();
    }

    @Override
    public List<cloudVendor> getAllCloudVendor() {
        return CloudVendorRespository.findAll();
    }
}
