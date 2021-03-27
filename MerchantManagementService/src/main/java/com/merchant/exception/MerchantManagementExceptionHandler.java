package com.merchant.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MerchantManagementExceptionHandler {

    Logger logger = LoggerFactory.getLogger(MerchantManagementExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String handleException(Exception exception){
        logger.error("Exception occurred with message: {}", exception.getMessage());
        return exception.getMessage();
    }
}
