package com.bbva.pisd.dto.insurancedao.entities;

import java.math.BigDecimal;

public class InsuranceBusinessEntity {
    private BigDecimal insuranceRiskBusinessId;
    private String insuranceBusinessName;

    public BigDecimal getInsuranceRiskBusinessId() {
        return insuranceRiskBusinessId;
    }

    public void setInsuranceRiskBusinessId(BigDecimal insuranceRiskBusinessId) {
        this.insuranceRiskBusinessId = insuranceRiskBusinessId;
    }

    public String getInsuranceBusinessName() {
        return insuranceBusinessName;
    }

    public void setInsuranceBusinessName(String insuranceBusinessName) {
        this.insuranceBusinessName = insuranceBusinessName;
    }
}
