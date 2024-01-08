package com.bbva.pisd.dto.insurancedao.entities;

import java.util.Date;

public class QuotationEntity {

    /**
     * Propiedades de auditoria
     * @creationUserId
     * @creationDate
     * @userAuditId
     * @auditDate
     */
    private String creationUserId;
    private Date creationDate;
    private String userAuditId;
    private Date auditDate;
    private String policyQuotaInternalId;
    private String  insuranceSimulationId;
    private String insuranceCompanyQuotaId;
    private String quoteDate;
    private String quotaHmsDate;
    private String policyQuotaEndValidityDate;
    private String customerId;
    private String  policyQuotaStatusType;
    private String lastChangeBranchId;
    private String sourceBranchId;
    private String personalDocType;
    private String participantPersonalId;
    private Date policyQuotaCancellationDate;
    private String insuredCustomerName;
    private String clientLasName;
    private String issuedReceiptNumber;
    private String lastFourPanId;

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

    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public void setPolicyQuotaInternalId(String policyQuotaInternalId) {
        this.policyQuotaInternalId = policyQuotaInternalId;
    }

    public String getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public void setInsuranceSimulationId(String insuranceSimulationId) {
        this.insuranceSimulationId = insuranceSimulationId;
    }

    public String getInsuranceCompanyQuotaId() {
        return insuranceCompanyQuotaId;
    }

    public void setInsuranceCompanyQuotaId(String insuranceCompanyQuotaId) {
        this.insuranceCompanyQuotaId = insuranceCompanyQuotaId;
    }

    public String getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(String quoteDate) {
        this.quoteDate = quoteDate;
    }

    public String getQuotaHmsDate() {
        return quotaHmsDate;
    }

    public void setQuotaHmsDate(String quotaHmsDate) {
        this.quotaHmsDate = quotaHmsDate;
    }

    public String getPolicyQuotaEndValidityDate() {
        return policyQuotaEndValidityDate;
    }

    public void setPolicyQuotaEndValidityDate(String policyQuotaEndValidityDate) {
        this.policyQuotaEndValidityDate = policyQuotaEndValidityDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyQuotaStatusType() {
        return policyQuotaStatusType;
    }

    public void setPolicyQuotaStatusType(String policyQuotaStatusType) {
        this.policyQuotaStatusType = policyQuotaStatusType;
    }

    public String getLastChangeBranchId() {
        return lastChangeBranchId;
    }

    public void setLastChangeBranchId(String lastChangeBranchId) {
        this.lastChangeBranchId = lastChangeBranchId;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
    }

    public void setSourceBranchId(String sourceBranchId) {
        this.sourceBranchId = sourceBranchId;
    }

    public String getPersonalDocType() {
        return personalDocType;
    }

    public void setPersonalDocType(String personalDocType) {
        this.personalDocType = personalDocType;
    }

    public String getParticipantPersonalId() {
        return participantPersonalId;
    }

    public void setParticipantPersonalId(String participantPersonalId) {
        this.participantPersonalId = participantPersonalId;
    }

    public Date getPolicyQuotaCancellationDate() {
        return policyQuotaCancellationDate;
    }

    public void setPolicyQuotaCancellationDate(Date policyQuotaCancellationDate) {
        this.policyQuotaCancellationDate = policyQuotaCancellationDate;
    }

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public void setInsuredCustomerName(String insuredCustomerName) {
        this.insuredCustomerName = insuredCustomerName;
    }

    public String getClientLasName() {
        return clientLasName;
    }

    public void setClientLasName(String clientLasName) {
        this.clientLasName = clientLasName;
    }

    public String getIssuedReceiptNumber() {
        return issuedReceiptNumber;
    }

    public void setIssuedReceiptNumber(String issuedReceiptNumber) {
        this.issuedReceiptNumber = issuedReceiptNumber;
    }

    public String getLastFourPanId() {
        return lastFourPanId;
    }

    public void setLastFourPanId(String lastFourPanId) {
        this.lastFourPanId = lastFourPanId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationEntity{");
        sb.append("creationUserId='").append(creationUserId).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append(", userAuditId='").append(userAuditId).append('\'');
        sb.append(", auditDate=").append(auditDate);
        sb.append(", policyQuotaInternalId='").append(policyQuotaInternalId).append('\'');
        sb.append(", insuranceSimulationId='").append(insuranceSimulationId).append('\'');
        sb.append(", insuranceCompanyQuotaId='").append(insuranceCompanyQuotaId).append('\'');
        sb.append(", quoteDate=").append(quoteDate);
        sb.append(", quotaHmsDate='").append(quotaHmsDate).append('\'');
        sb.append(", policyQuotaEndValidityDate='").append(policyQuotaEndValidityDate).append('\'');
        sb.append(", customerId='").append(customerId).append('\'');
        sb.append(", policyQuotaStatusType='").append(policyQuotaStatusType).append('\'');
        sb.append(", lastChangeBranchId='").append(lastChangeBranchId).append('\'');
        sb.append(", sourceBranchId='").append(sourceBranchId).append('\'');
        sb.append(", personalDocType='").append(personalDocType).append('\'');
        sb.append(", participantPersonalId='").append(participantPersonalId).append('\'');
        sb.append(", policyQuotaCancellationDate=").append(policyQuotaCancellationDate);
        sb.append(", insuredCustomerName='").append(insuredCustomerName).append('\'');
        sb.append(", clientLasName='").append(clientLasName).append('\'');
        sb.append(", issuedReceiptNumber='").append(issuedReceiptNumber).append('\'');
        sb.append(", lastFourPanId='").append(lastFourPanId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
