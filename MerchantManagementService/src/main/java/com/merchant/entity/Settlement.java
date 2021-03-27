package com.merchant.entity;

import com.merchant.dto.SettlementDTO;

import javax.persistence.Embeddable;

@Embeddable
public class Settlement {

    private String accountNumber;
    private String ifscCode;

    public static Settlement valueOf(SettlementDTO settlementDTO) {
        Settlement settlement = new Settlement();
        settlement.setAccountNumber(settlementDTO.getAccountNumber());
        settlement.setIfscCode(settlementDTO.getIfscCode());
        return settlement;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
}
