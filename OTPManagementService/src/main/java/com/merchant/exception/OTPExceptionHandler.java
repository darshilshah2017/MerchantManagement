package com.merchant.exception;

import com.merchant.entity.OTPDetails;
import com.merchant.service.OTPManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OTPExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(OTPManagementService.class);

    @ExceptionHandler(OTPManagementException.class)
    public ResponseEntity<String> OTPManagementExceptionHandler(OTPManagementException exception){
        logger.error("OTPManagementException occurred with message: {}",exception.getMessage());
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> OTPManagementExceptionHandler(Exception exception){
        logger.error("Exception occurred with message: {}",exception.getMessage());
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
