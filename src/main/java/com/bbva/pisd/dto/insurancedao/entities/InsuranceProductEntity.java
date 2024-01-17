package com.bbva.pisd.dto.insurancedao.entities;

import java.math.BigDecimal;

public class InsuranceProductEntity {
    private BigDecimal insuranceProductId;
    private BigDecimal insuranceRiskBusinessId;
    private BigDecimal insurnaceTypeId;
    private String insuranceProductDesc;
    private String insuranceProductName;
    private String insuranceProductType;
    private String giftProductType;
    private BigDecimal simltValidityDaysNumber;
    private String collectivePolicyType;
    private String attemptClctInsrcCnclType;
    private BigDecimal chargeAttemptsNumber;
    private String jointIndType;
    private String billingRateChangeIndType;
    private String deferredEntryIndType;
    private String healthEvalMarkType;

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
    }

    public BigDecimal getInsuranceRiskBusinessId() {
        return insuranceRiskBusinessId;
    }

    public void setInsuranceRiskBusinessId(BigDecimal insuranceRiskBusinessId) {
        this.insuranceRiskBusinessId = insuranceRiskBusinessId;
    }

    public BigDecimal getInsurnaceTypeId() {
        return insurnaceTypeId;
    }

    public void setInsurnaceTypeId(BigDecimal insurnaceTypeId) {
        this.insurnaceTypeId = insurnaceTypeId;
    }

    public String getInsuranceProductDesc() {
        return insuranceProductDesc;
    }

    public void setInsuranceProductDesc(String insuranceProductDesc) {
        this.insuranceProductDesc = insuranceProductDesc;
    }

    public String getInsuranceProductName() {
        return insuranceProductName;
    }

    public void setInsuranceProductName(String insuranceProductName) {
        this.insuranceProductName = insuranceProductName;
    }

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }

    public String getGiftProductType() {
        return giftProductType;
    }

    public void setGiftProductType(String giftProductType) {
        this.giftProductType = giftProductType;
    }

    public BigDecimal getSimltValidityDaysNumber() {
        return simltValidityDaysNumber;
    }

    public void setSimltValidityDaysNumber(BigDecimal simltValidityDaysNumber) {
        this.simltValidityDaysNumber = simltValidityDaysNumber;
    }

    public String getCollectivePolicyType() {
        return collectivePolicyType;
    }

    public void setCollectivePolicyType(String collectivePolicyType) {
        this.collectivePolicyType = collectivePolicyType;
    }

    public String getAttemptClctInsrcCnclType() {
        return attemptClctInsrcCnclType;
    }

    public void setAttemptClctInsrcCnclType(String attemptClctInsrcCnclType) {
        this.attemptClctInsrcCnclType = attemptClctInsrcCnclType;
    }

    public BigDecimal getChargeAttemptsNumber() {
        return chargeAttemptsNumber;
    }

    public void setChargeAttemptsNumber(BigDecimal chargeAttemptsNumber) {
        this.chargeAttemptsNumber = chargeAttemptsNumber;
    }

    public String getJointIndType() {
        return jointIndType;
    }

    public void setJointIndType(String jointIndType) {
        this.jointIndType = jointIndType;
    }

    public String getBillingRateChangeIndType() {
        return billingRateChangeIndType;
    }

    public void setBillingRateChangeIndType(String billingRateChangeIndType) {
        this.billingRateChangeIndType = billingRateChangeIndType;
    }

    public String getDeferredEntryIndType() {
        return deferredEntryIndType;
    }

    public void setDeferredEntryIndType(String deferredEntryIndType) {
        this.deferredEntryIndType = deferredEntryIndType;
    }

    public String getHealthEvalMarkType() {
        return healthEvalMarkType;
    }

    public void setHealthEvalMarkType(String healthEvalMarkType) {
        this.healthEvalMarkType = healthEvalMarkType;
    }
}
