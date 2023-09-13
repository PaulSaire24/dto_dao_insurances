package com.bbva.pisd.dto.insurancedao.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SimulationEntity  {
    private BigDecimal insuranceSimulationId ;
    private String insrncCompanySimulationId ;
    private String customerId                ;
    private String customerSimulationDate    ;
    private String custSimulationExpiredDate ;
    private String bankFactorType            ;
    private BigDecimal bankFactorAmount      ;
    private BigDecimal bankFactorPer         ;
    private String registrySituationType     ;
    private String sourceBranchId            ;
    private String creationUserId            ;
    private Date   creationDate              ;
    private String userAuditId               ;
    private Date   auditDate                 ;
    private String personalDocType           ;
    private String participantPersonalId     ;
    private String insuredCustomerName       ;
    private String clientLastName            ;
    private String dataTreatmentIndType      ;
    private String customerSegmentName       ;

    public static final class SimulationEntityBuilder {
        private SimulationEntity simulationEntity;

        public SimulationEntityBuilder(){
            simulationEntity = new SimulationEntity();
        }

        public static SimulationEntityBuilder an(){
            return new SimulationEntityBuilder();
        }

        public SimulationEntityBuilder withInsuranceSimulationId(BigDecimal insuranceSimulationId){
            this.simulationEntity.setInsuranceSimulationId(insuranceSimulationId);
            return this;
        }

        public SimulationEntityBuilder withInsrncCompanySimulationId(String insrncCompanySimulationId){
            this.simulationEntity.setInsrncCompanySimulationId(insrncCompanySimulationId);
            return this;
        }

        public SimulationEntityBuilder withCustomerId(String customerId){
            this.simulationEntity.setCustomerId(customerId);
            return this;
        }

        public SimulationEntityBuilder withCustomerSimulationDate(String customerSimulationDate){
            this.simulationEntity.setCustomerSimulationDate(customerSimulationDate);
            return this;
        }

        public SimulationEntityBuilder withCustSimulationExpiredDate(String custSimulationExpiredDate){
            this.simulationEntity.setCustSimulationExpiredDate(custSimulationExpiredDate);
            return this;
        }

        public SimulationEntityBuilder withBankFactorType(String bankFactorType){
            this.simulationEntity.setBankFactorType(bankFactorType);
            return this;
        }
        public SimulationEntityBuilder withBankFactorAmount(BigDecimal bankFactorAmount){
            this.simulationEntity.setBankFactorAmount(bankFactorAmount);
            return this;
        }
        public SimulationEntityBuilder withBankFactorPer(BigDecimal bankFactorPer){
            this.simulationEntity.setBankFactorPer(bankFactorPer);
            return this;
        }

        public SimulationEntityBuilder withRegistrySituationType(String registrySituationType){
            this.simulationEntity.setRegistrySituationType(registrySituationType);
            return this;
        }

        public SimulationEntityBuilder withSourceBranchId(String sourceBranchId){
            this.simulationEntity.setSourceBranchId(sourceBranchId);
            return this;
        }
        public SimulationEntityBuilder withCreationUserId(String creationUserId){
            this.simulationEntity.setCreationUserId(creationUserId);
            return this;
        }
        public SimulationEntityBuilder withCreationDate(Date creationDate){
            this.simulationEntity.setCreationDate(creationDate);
            return this;
        }

        public SimulationEntityBuilder withUserAuditId(String userAuditId){
            this.simulationEntity.setUserAuditId(userAuditId);
            return this;
        }
        public SimulationEntityBuilder withAuditDate(Date auditDate){
            this.simulationEntity.setAuditDate(auditDate);
            return this;
        }
        public SimulationEntityBuilder withPersonalDocType(String personalDocType){
            this.simulationEntity.setPersonalDocType(personalDocType);
            return this;
        }
        public SimulationEntityBuilder withParticipantPersonalId(String participantPersonalId){
            this.simulationEntity.setParticipantPersonalId(participantPersonalId);
            return this;
        }
        public SimulationEntityBuilder withInsuredCustomerName(String insuredCustomerName){
            this.simulationEntity.setInsuredCustomerName(insuredCustomerName);
            return this;
        }
        public SimulationEntityBuilder withClientLastName(String clientLastName){
            this.simulationEntity.setClientLastName(clientLastName);
            return this;
        }
        public SimulationEntityBuilder withDataTreatmentIndType(String dataTreatmentIndType){
            this.simulationEntity.setDataTreatmentIndType(dataTreatmentIndType);
            return this;
        }
        public SimulationEntityBuilder withCustomerSegmentName(String customerSegmentName){
            this.simulationEntity.setCustomerSegmentName(customerSegmentName);
            return this;
        }


        public SimulationEntity build(){
            return this.simulationEntity;
        }

    }


    public BigDecimal getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public void setInsuranceSimulationId(BigDecimal insuranceSimulationId) {
        this.insuranceSimulationId = insuranceSimulationId;
    }

    public String getInsrncCompanySimulationId() {
        return insrncCompanySimulationId;
    }

    public void setInsrncCompanySimulationId(String insrncCompanySimulationId) {
        this.insrncCompanySimulationId = insrncCompanySimulationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerSimulationDate() {
        return customerSimulationDate;
    }

    public void setCustomerSimulationDate(String customerSimulationDate) {
        this.customerSimulationDate = customerSimulationDate;
    }

    public String getCustSimulationExpiredDate() {
        return custSimulationExpiredDate;
    }

    public void setCustSimulationExpiredDate(String custSimulationExpiredDate) {
        this.custSimulationExpiredDate = custSimulationExpiredDate;
    }

    public String getBankFactorType() {
        return bankFactorType;
    }

    public void setBankFactorType(String bankFactorType) {
        this.bankFactorType = bankFactorType;
    }

    public BigDecimal getBankFactorAmount() {
        return bankFactorAmount;
    }

    public void setBankFactorAmount(BigDecimal bankFactorAmount) {
        this.bankFactorAmount = bankFactorAmount;
    }

    public BigDecimal getBankFactorPer() {
        return bankFactorPer;
    }

    public void setBankFactorPer(BigDecimal bankFactorPer) {
        this.bankFactorPer = bankFactorPer;
    }

    public String getRegistrySituationType() {
        return registrySituationType;
    }

    public void setRegistrySituationType(String registrySituationType) {
        this.registrySituationType = registrySituationType;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
    }

    public void setSourceBranchId(String sourceBranchId) {
        this.sourceBranchId = sourceBranchId;
    }

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

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public void setInsuredCustomerName(String insuredCustomerName) {
        this.insuredCustomerName = insuredCustomerName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getDataTreatmentIndType() {
        return dataTreatmentIndType;
    }

    public void setDataTreatmentIndType(String dataTreatmentIndType) {
        this.dataTreatmentIndType = dataTreatmentIndType;
    }

    public String getCustomerSegmentName() {
        return customerSegmentName;
    }

    public void setCustomerSegmentName(String customerSegmentName) {
        this.customerSegmentName = customerSegmentName;
    }

    @Override
    public String toString() {
        return "SimulationEntity{" +
                "insuranceSimulationId=" + insuranceSimulationId +
                ", insrncCompanySimulationId='" + insrncCompanySimulationId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerSimulationDate='" + customerSimulationDate + '\'' +
                ", custSimulationExpiredDate='" + custSimulationExpiredDate + '\'' +
                ", bankFactorType='" + bankFactorType + '\'' +
                ", bankFactorAmount=" + bankFactorAmount +
                ", bankFactorPer=" + bankFactorPer +
                ", registrySituationType='" + registrySituationType + '\'' +
                ", sourceBranchId='" + sourceBranchId + '\'' +
                ", creationUserId='" + creationUserId + '\'' +
                ", creationDate=" + creationDate +
                ", userAuditId='" + userAuditId + '\'' +
                ", auditDate=" + auditDate +
                ", personalDocType='" + personalDocType + '\'' +
                ", participantPersonalId='" + participantPersonalId + '\'' +
                ", insuredCustomerName='" + insuredCustomerName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", dataTreatmentIndType='" + dataTreatmentIndType + '\'' +
                ", customerSegmentName='" + customerSegmentName + '\'' +
                '}';
    }
}
