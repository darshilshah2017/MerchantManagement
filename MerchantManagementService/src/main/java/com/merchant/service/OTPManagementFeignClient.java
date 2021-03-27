package com.merchant.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("OTPManagementMS")
public interface OTPManagementFeignClient {

    @RequestMapping(value = "/Ind/otp", method = RequestMethod.GET)
    public String verifyOTP(@RequestParam("mobileNumber") long mobileNumber,
                           @RequestParam("otp") short otp);
}
