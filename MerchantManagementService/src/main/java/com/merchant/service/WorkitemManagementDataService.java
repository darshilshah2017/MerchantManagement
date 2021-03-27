package com.merchant.service;

import com.merchant.dto.MerchantManagementDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WorkitemManagementDataService {

    Logger logger = LoggerFactory.getLogger(WorkitemManagementDataService.class);

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "createWorkitemFallback")
    public String createWorkitem(MerchantManagementDTO merchantDTO){
        logger.info("Create workitem request: {}", merchantDTO);
        ResponseEntity<String> workitemManagementResponse = restTemplate.postForEntity("http://WorkitemManagementMS/Ind/workitem",merchantDTO.toString(), String.class);
        logger.info("Create workitem response: {}", workitemManagementResponse.getBody());

        return workitemManagementResponse.getBody();
    }

    public String createWorkitemFallback(MerchantManagementDTO merchantDTO){
        logger.error("Fallback method invoked for create workitem request: {}", merchantDTO);
        return "Unable to create workitem now. Please try later";
    }
}
