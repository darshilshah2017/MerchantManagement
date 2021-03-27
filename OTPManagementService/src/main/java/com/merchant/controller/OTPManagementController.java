package com.merchant.controller;

import com.merchant.service.OTPManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otp")
public class OTPManagementController {

    private Logger logger = LoggerFactory.getLogger(OTPManagementController.class);

    @Autowired
    private OTPManagementService service;

    @PostMapping
    public short createOTP(@RequestParam("mobileNumber") long mobileNumber){
        logger.info("create OTP request received for mobile number: {}", mobileNumber);
        return service.createOTP(mobileNumber);
    }

    @GetMapping
    public String verifyOTP(@RequestParam("mobileNumber") long mobileNumber,
                            @RequestParam("otp") short otp){
        logger.info("verify OTP request received for mobile number: {} with otp: {}", mobileNumber,otp);
        return service.verifyOTP(mobileNumber, otp);
    }
}
