package com.merchant.dto;

import com.merchant.entity.MerchantManagement;

public class MerchantManagementDTO {

    private String merchantId;
    private NameDTO name;
    private BusinessDetailsDTO businessDetails;
    private SettlementDTO settlement;
    private ContactDetailsDTO contactDetails;

    public static MerchantManagementDTO valueOf(MerchantManagement merchantManagement) {
        MerchantManagementDTO managementDTO = new MerchantManagementDTO();
        managementDTO.setName(NameDTO.valueOf(merchantManagement.getName()));
        managementDTO.setBusinessDetails(BusinessDetailsDTO.valueOf(merchantManagement.getBusinessDetails()));
        managementDTO.setContactDetails(ContactDetailsDTO.valueOf(merchantManagement.getContactDetails()));
        managementDTO.setSettlement(SettlementDTO.valueOf(merchantManagement.getSettlement()));

        return managementDTO;
    }

    @Override
    public String toString() {
        return "MerchantManagementDTO{" +
                "merchantId='" + merchantId + '\'' +
                ", name=" + name +
                ", businessDetails=" + businessDetails +
                ", settlement=" + settlement +
                ", contactDetails=" + contactDetails +
                '}';
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public NameDTO getName() {
        return name;
    }

    public void setName(NameDTO name) {
        this.name = name;
    }

    public BusinessDetailsDTO getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetailsDTO businessDetails) {
        this.businessDetails = businessDetails;
    }

    public SettlementDTO getSettlement() {
        return settlement;
    }

    public void setSettlement(SettlementDTO settlement) {
        this.settlement = settlement;
    }

    public ContactDetailsDTO getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetailsDTO contactDetails) {
        this.contactDetails = contactDetails;
    }
}
