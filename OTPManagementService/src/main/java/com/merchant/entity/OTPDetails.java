package com.merchant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OTPDetails {
    @Id
    private long mobileNumber;
    private short otp;

    public OTPDetails(){}

    public OTPDetails(long mobileNumber, short otp) {
        this.mobileNumber = mobileNumber;
        this.otp = otp;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public short getOtp() {
        return otp;
    }

    public void setOtp(short otp) {
        this.otp = otp;
    }
}
