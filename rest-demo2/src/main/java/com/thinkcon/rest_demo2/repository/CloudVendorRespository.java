package com.thinkcon.rest_demo2.repository;

import com.thinkcon.rest_demo2.model.cloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRespository extends JpaRepository <cloudVendor, String>{
}
