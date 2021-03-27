package com.merchant.controller;

import com.merchant.dto.MerchantManagementDTO;
import com.merchant.service.MerchantManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/merchant")
public class MerchantManagementController {

    Logger logger = LoggerFactory.getLogger(MerchantManagementController.class);

    @Autowired
    MerchantManagementService service;

    @GetMapping
    public MerchantManagementDTO getMerchant(@RequestParam("merchantId") String merchantId){
        logger.info("Get merchant details request received: {}", merchantId);
        MerchantManagementDTO managementDTO = service.getMerchant(merchantId);
        logger.info("Get merchant details response sent: {}", managementDTO);
        return managementDTO;
    }

    @PostMapping
    public String createMerchant(@Valid @RequestBody MerchantManagementDTO merchantManagement){
        logger.info("Create merchant request received: {}", merchantManagement);
        String merchantId = service.createMerchant(merchantManagement);
        logger.info("Create merchant response sent: {}", merchantId);
        return merchantId;
    }
}
