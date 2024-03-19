package com.bbva.pisd.dto.insurancedao.entities;

import java.math.BigDecimal;
import java.util.Date;

public class ModalityEntity {

    private String creationUserId;
    private Date creationDate;
    private String userAuditId;
    private Date auditDate;
    private BigDecimal insuranceProductId;
    private String insuranceModalityType;
    private BigDecimal insuranceCompanyId;
    private String insuranceCompanyModalityId;
    private String currencyId;
    private String insurModalityDesc;
    private String insuranceModalityName;
    private String operationGlossaryDesc;
    private Date insrncModVldyStartDate;
    private Date insrncModalityVldyEndDate;
    private String cumulusMarkType;


    public String getCreationUserId() {
        return creationUserId;
    }

    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public void setUserAuditId(String userAuditId) {
        this.userAuditId = userAuditId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
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

    public BigDecimal getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(BigDecimal insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public String getInsuranceCompanyModalityId() {
        return insuranceCompanyModalityId;
    }

    public void setInsuranceCompanyModalityId(String insuranceCompanyModalityId) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getInsurModalityDesc() {
        return insurModalityDesc;
    }

    public void setInsurModalityDesc(String insurModalityDesc) {
        this.insurModalityDesc = insurModalityDesc;
    }

    public String getInsuranceModalityName() {
        return insuranceModalityName;
    }

    public void setInsuranceModalityName(String insuranceModalityName) {
        this.insuranceModalityName = insuranceModalityName;
    }

    public String getOperationGlossaryDesc() {
        return operationGlossaryDesc;
    }

    public void setOperationGlossaryDesc(String operationGlossaryDesc) {
        this.operationGlossaryDesc = operationGlossaryDesc;
    }

    public Date getInsrncModVldyStartDate() {
        return insrncModVldyStartDate;
    }

    public void setInsrncModVldyStartDate(Date insrncModVldyStartDate) {
        this.insrncModVldyStartDate = insrncModVldyStartDate;
    }

    public Date getInsrncModalityVldyEndDate() {
        return insrncModalityVldyEndDate;
    }

    public void setInsrncModalityVldyEndDate(Date insrncModalityVldyEndDate) {
        this.insrncModalityVldyEndDate = insrncModalityVldyEndDate;
    }

    public String getCumulusMarkType() {
        return cumulusMarkType;
    }

    public void setCumulusMarkType(String cumulusMarkType) {
        this.cumulusMarkType = cumulusMarkType;
    }
}
