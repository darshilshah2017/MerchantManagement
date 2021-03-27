package com.merchant.service;

import com.merchant.dto.MerchantManagementDTO;
import com.merchant.entity.MerchantManagement;
import com.merchant.exception.MerchantManagementException;
import com.merchant.repository.MerchantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RibbonClient(name = "MerchantManagementRibbon"/*, configuration = RibbonConfig.class*/)
public class MerchantManagementService {

    Logger logger = LoggerFactory.getLogger(MerchantManagementService.class);

    @Autowired
    private MerchantRepository merchantRepository;
    @Autowired
    OTPManagementFeignClient otpFeignClient;
    @Autowired
    WorkitemManagementDataService workitemDataService;

    public String createMerchant(MerchantManagementDTO merchantDTO){
        logger.info("Request entered service class");

        /*otpFeignClient.verifyOTP(merchantDTO.getContactDetails().getMobileNumber(),
                                merchantDTO.getContactDetails().getOtp());*/
        logger.info("OTP verified successfully");

        /*List<MerchantManagement> merchantList = merchantRepository.findByContactDetails_MobileNumber(merchantDTO.getContactDetails().getMobileNumber());
        if(!merchantList.isEmpty()){
            logger.info("Another merchant exists with mobile number: {}", merchantDTO.getContactDetails().getMobileNumber());
            throw new MerchantManagementException("Another merchant with same mobile number exists.");
        }*/

        MerchantManagement merchant = MerchantManagement.valueOf(merchantDTO);
        merchantRepository.save(merchant);
        logger.info("Merchant created with id: {}", merchant.getMerchantId());
        merchantDTO.setMerchantId(merchant.getMerchantId());

        workitemDataService.createWorkitem(merchantDTO);

        return merchant.getMerchantId();
    }

    public MerchantManagementDTO getMerchant(String merchantId){
        logger.info("Request entered service class");
        Optional<MerchantManagement> merchantManagement = merchantRepository.findById(merchantId);
        if(!merchantManagement.isPresent()){
            logger.info("No merchant exists with id: {}", merchantId);
            throw new MerchantManagementException("No merchant exists with id: " + merchantId);
        }

        logger.info("Fetched merchant details: {}", merchantManagement.get());
        return MerchantManagementDTO.valueOf(merchantManagement.get());
    }
}
