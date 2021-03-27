package com.merchant.entity;

import com.merchant.dto.BusinessDetailsDTO;

import javax.persistence.Embeddable;

@Embeddable
public class BusinessDetails {

    private String businessName;
    private String legalName;
    private String lineOfBusiness;
    private String licenseNumber;

    public static BusinessDetails valueOf(BusinessDetailsDTO businessDetailsDTO) {
        BusinessDetails businessDetails = new BusinessDetails();
        businessDetails.setBusinessName(businessDetailsDTO.getBusinessName());
        businessDetails.setLegalName(businessDetailsDTO.getLegalName());
        businessDetails.setLicenseNumber(businessDetailsDTO.getLicenseNumber());
        businessDetails.setLineOfBusiness(businessDetailsDTO.getLineOfBusiness());

        return businessDetails;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
