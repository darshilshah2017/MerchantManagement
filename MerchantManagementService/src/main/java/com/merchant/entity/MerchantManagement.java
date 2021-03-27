package com.merchant.entity;

import com.merchant.dto.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class MerchantManagement {

    @Id
    private String merchantId;
    @Embedded
    private Name name;
    @Embedded
    private BusinessDetails businessDetails;
    @Embedded
    private Settlement settlement;
    @Embedded
    private ContactDetails contactDetails;

    public static MerchantManagement valueOf(MerchantManagementDTO merchantDTO) {
        MerchantManagement merchant = new MerchantManagement();
        merchant.setMerchantId(UUID.randomUUID().toString());
        merchant.setName(Name.valueOf(merchantDTO.getName()));
        merchant.setBusinessDetails(BusinessDetails.valueOf(merchantDTO.getBusinessDetails()));
        merchant.setContactDetails(ContactDetails.valueOf(merchantDTO.getContactDetails()));
        merchant.setSettlement(Settlement.valueOf(merchantDTO.getSettlement()));
        return merchant;
    }

    @Override
    public String toString() {
        return "MerchantManagement{" +
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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(BusinessDetails businessDetails) {
        this.businessDetails = businessDetails;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }
}
