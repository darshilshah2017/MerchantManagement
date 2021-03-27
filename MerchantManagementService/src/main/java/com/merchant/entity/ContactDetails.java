package com.merchant.entity;

import com.merchant.dto.ContactDetailsDTO;

import javax.persistence.Embeddable;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;

@Embeddable
public class ContactDetails {

    private long mobileNumber;
    private String emailId;

    public static ContactDetails valueOf(ContactDetailsDTO contactDetailsDTO) {
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setEmailId(contactDetailsDTO.getEmailId());
        contactDetails.setMobileNumber(contactDetailsDTO.getMobileNumber());
        return contactDetails;
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

}
