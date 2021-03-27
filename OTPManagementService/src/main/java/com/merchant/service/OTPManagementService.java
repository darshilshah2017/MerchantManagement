package com.merchant.service;

import com.merchant.controller.OTPManagementController;
import com.merchant.entity.OTPDetails;
import com.merchant.exception.OTPManagementException;
import com.merchant.repository.OTPRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;
import java.util.Random;

@Service
public class OTPManagementService {

    private Logger logger = LoggerFactory.getLogger(OTPManagementService.class);

    private Random rnd;

    @Autowired
    private OTPRepository repository;

    @PostConstruct
    public void init(){
        rnd = new Random();
    }


    public short createOTP(long mobileNumber){
        short otp = Short.parseShort(String.format("%04d",rnd.nextInt(9999)));
        OTPDetails otpDetails = new OTPDetails(mobileNumber, otp);
        repository.save(otpDetails);

        logger.info("OTP: {} created for mobile number: {}", otp,mobileNumber);
        return otp;
    }

    public String verifyOTP(long mobilenumber, short otp){
        Optional<OTPDetails> otpDetails = repository.findById(mobilenumber);
        if(!otpDetails.isPresent())
            throw new OTPManagementException("No OTP exists for mobile number: "+mobilenumber);

        if(otpDetails.get().getOtp() != otp)
            throw new OTPManagementException("Invalid OTP");

        repository.deleteById(mobilenumber);
        logger.info("OTP: {} verified successfully for mobile number: {}", otp,mobilenumber);
        return "OTP verified successfully";
    }
}
