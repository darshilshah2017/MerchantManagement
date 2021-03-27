package com.merchant.dto;

import com.merchant.entity.Settlement;

public class SettlementDTO {

    private String accountNumber;
    private String ifscCode;

    public static SettlementDTO valueOf(Settlement settlement) {
        SettlementDTO settlementDTO = new SettlementDTO();
        settlementDTO.setAccountNumber(settlement.getAccountNumber());
        settlementDTO.setIfscCode(settlement.getIfscCode());

        return settlementDTO;
    }

    @Override
    public String toString() {
        return "SettlementDTO{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
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
