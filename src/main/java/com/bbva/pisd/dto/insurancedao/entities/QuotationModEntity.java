package com.bbva.pisd.dto.insurancedao.entities;

import java.math.BigDecimal;

public class QuotationModEntity {
    private String policyQuotationInternal;
    private BigDecimal insuranceProductId;
    private String insuranceModalityType;
    private String saleChannelId;
    private BigDecimal paymentTermNumber;
    private String policyPaymentFrequencyType;
    private String financingStartDate;
    private String financingEndDate;
    private BigDecimal premiumAmount;
    private String premiumCurrencyId;
    private String savedQuotationIndType;
    private String lastChangeBranch;
    private String sourceBranchId;
    private String policyQuotStatusType;
    private String dataTreatmentIndType;
    private String contactEmailDesc;
    private String customerPhoneDesc;
    private String contactTimeType;
    private String domicileContractId;

    public String getPolicyQuotationInternal() {
        return policyQuotationInternal;
    }

    public void setPolicyQuotationInternal(String policyQuotationInternal) {
        this.policyQuotationInternal = policyQuotationInternal;
    }

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public void setInsuranceModalityType(String insuranceModalityType) {
        this.insuranceModalityType = insuranceModalityType;
    }

    public String getSaleChannelId() {
        return saleChannelId;
    }

    public void setSaleChannelId(String saleChannelId) {
        this.saleChannelId = saleChannelId;
    }

    public BigDecimal getPaymentTermNumber() {
        return paymentTermNumber;
    }

    public void setPaymentTermNumber(BigDecimal paymentTermNumber) {
        this.paymentTermNumber = paymentTermNumber;
    }

    public String getPolicyPaymentFrequencyType() {
        return policyPaymentFrequencyType;
    }

    public void setPolicyPaymentFrequencyType(String policyPaymentFrequencyType) {
        this.policyPaymentFrequencyType = policyPaymentFrequencyType;
    }

    public String getFinancingStartDate() {
        return financingStartDate;
    }

    public void setFinancingStartDate(String financingStartDate) {
        this.financingStartDate = financingStartDate;
    }

    public String getFinancingEndDate() {
        return financingEndDate;
    }

    public void setFinancingEndDate(String financingEndDate) {
        this.financingEndDate = financingEndDate;
    }

    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(BigDecimal premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getPremiumCurrencyId() {
        return premiumCurrencyId;
    }

    public void setPremiumCurrencyId(String premiumCurrencyId) {
        this.premiumCurrencyId = premiumCurrencyId;
    }

    public String getSavedQuotationIndType() {
        return savedQuotationIndType;
    }

    public void setSavedQuotationIndType(String savedQuotationIndType) {
        this.savedQuotationIndType = savedQuotationIndType;
    }

    public String getLastChangeBranch() {
        return lastChangeBranch;
    }

    public void setLastChangeBranch(String lastChangeBranch) {
        this.lastChangeBranch = lastChangeBranch;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
    }

    public void setSourceBranchId(String sourceBranchId) {
        this.sourceBranchId = sourceBranchId;
    }

    public String getPolicyQuotStatusType() {
        return policyQuotStatusType;
    }

    public void setPolicyQuotStatusType(String policyQuotStatusType) {
        this.policyQuotStatusType = policyQuotStatusType;
    }

    public String getDataTreatmentIndType() {
        return dataTreatmentIndType;
    }

    public void setDataTreatmentIndType(String dataTreatmentIndType) {
        this.dataTreatmentIndType = dataTreatmentIndType;
    }

    public String getContactEmailDesc() {
        return contactEmailDesc;
    }

    public void setContactEmailDesc(String contactEmailDesc) {
        this.contactEmailDesc = contactEmailDesc;
    }

    public String getCustomerPhoneDesc() {
        return customerPhoneDesc;
    }

    public void setCustomerPhoneDesc(String customerPhoneDesc) {
        this.customerPhoneDesc = customerPhoneDesc;
    }

    public String getContactTimeType() {
        return contactTimeType;
    }

    public void setContactTimeType(String contactTimeType) {
        this.contactTimeType = contactTimeType;
    }

    public String getDomicileContractId() {
        return domicileContractId;
    }

    public void setDomicileContractId(String domicileContractId) {
        this.domicileContractId = domicileContractId;
    }
}
