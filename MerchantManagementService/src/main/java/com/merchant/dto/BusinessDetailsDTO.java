package com.merchant.dto;

import com.merchant.entity.BusinessDetails;

public class BusinessDetailsDTO {

    private String businessName;
    private String legalName;
    private String lineOfBusiness;
    private String licenseNumber;

    public static BusinessDetailsDTO valueOf(BusinessDetails businessDetails) {
        BusinessDetailsDTO businessDTO = new BusinessDetailsDTO();
        businessDTO.setBusinessName(businessDetails.getBusinessName());
        businessDTO.setLegalName(businessDetails.getLegalName());
        businessDTO.setLicenseNumber(businessDetails.getLicenseNumber());
        businessDTO.setLineOfBusiness(businessDetails.getLineOfBusiness());

        return businessDTO;
    }

    @Override
    public String toString() {
        return "BusinessDetailsDTO{" +
                "businessName='" + businessName + '\'' +
                ", legalName='" + legalName + '\'' +
                ", lineOfBusiness='" + lineOfBusiness + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
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
