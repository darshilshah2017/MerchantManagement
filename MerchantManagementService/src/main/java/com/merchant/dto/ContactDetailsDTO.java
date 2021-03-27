package com.merchant.dto;

import com.merchant.entity.ContactDetails;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;

public class ContactDetailsDTO {

    @Digits(integer = 10, message = "${merchant.mobileNumber.invalid}", fraction = 0)
    private long mobileNumber;
    @Email(message = "${merchant.email.invalid}")
    private String emailId;
    private short otp;

    public static ContactDetailsDTO valueOf(ContactDetails contactDetails) {
        ContactDetailsDTO contactDTO = new ContactDetailsDTO();
        contactDTO.setEmailId(contactDetails.getEmailId());
        contactDTO.setMobileNumber(contactDetails.getMobileNumber());

        return contactDTO;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public short getOtp() {
        return otp;
    }

    public void setOtp(short otp) {
        this.otp = otp;
    }

    @Override
    public String toString() {
        return "ContactDetailsDTO{" +
                "mobileNumber=" + mobileNumber +
                ", emailId='" + emailId + '\'' +
                ", otp=" + otp +
                '}';
    }
}
