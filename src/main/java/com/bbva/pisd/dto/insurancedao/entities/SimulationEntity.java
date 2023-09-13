package com.bbva.pisd.dto.insurancedao.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SimulationEntity  {
    private SimulationEntity() {}
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
            this.simulationEntity.insuranceSimulationId=insuranceSimulationId;
            return this;
        }

        public SimulationEntityBuilder withInsrncCompanySimulationId(String insrncCompanySimulationId){
            this.simulationEntity.insrncCompanySimulationId=insrncCompanySimulationId;
            return this;
        }

        public SimulationEntityBuilder withCustomerId(String customerId){
            this.simulationEntity.customerId=customerId;
            return this;
        }

        public SimulationEntityBuilder withCustomerSimulationDate(String customerSimulationDate){
            this.simulationEntity.customerSimulationDate=customerSimulationDate;
            return this;
        }

        public SimulationEntityBuilder withCustSimulationExpiredDate(String custSimulationExpiredDate){
            this.simulationEntity.custSimulationExpiredDate=custSimulationExpiredDate;
            return this;
        }

        public SimulationEntityBuilder withBankFactorType(String bankFactorType){
            this.simulationEntity.bankFactorType=bankFactorType;
            return this;
        }
        public SimulationEntityBuilder withBankFactorAmount(BigDecimal bankFactorAmount){
            this.simulationEntity.bankFactorAmount=bankFactorAmount;
            return this;
        }
        public SimulationEntityBuilder withBankFactorPer(BigDecimal bankFactorPer){
            this.simulationEntity.bankFactorPer=bankFactorPer;
            return this;
        }

        public SimulationEntityBuilder withRegistrySituationType(String registrySituationType){
            this.simulationEntity.registrySituationType=registrySituationType;
            return this;
        }

        public SimulationEntityBuilder withSourceBranchId(String sourceBranchId){
            this.simulationEntity.sourceBranchId=sourceBranchId;
            return this;
        }
        public SimulationEntityBuilder withCreationUserId(String creationUserId){
            this.simulationEntity.creationUserId=creationUserId;
            return this;
        }
        public SimulationEntityBuilder withCreationDate(Date creationDate){
            this.simulationEntity.creationDate=creationDate;
            return this;
        }

        public SimulationEntityBuilder withUserAuditId(String userAuditId){
            this.simulationEntity.userAuditId=userAuditId;
            return this;
        }
        public SimulationEntityBuilder withAuditDate(Date auditDate){
            this.simulationEntity.auditDate=auditDate;
            return this;
        }
        public SimulationEntityBuilder withPersonalDocType(String personalDocType){
            this.simulationEntity.personalDocType=personalDocType;
            return this;
        }
        public SimulationEntityBuilder withParticipantPersonalId(String participantPersonalId){
            this.simulationEntity.participantPersonalId=participantPersonalId;
            return this;
        }
        public SimulationEntityBuilder withInsuredCustomerName(String insuredCustomerName){
            this.simulationEntity.insuredCustomerName=insuredCustomerName;
            return this;
        }
        public SimulationEntityBuilder withClientLastName(String clientLastName){
            this.simulationEntity.clientLastName=clientLastName;
            return this;
        }
        public SimulationEntityBuilder withDataTreatmentIndType(String dataTreatmentIndType){
            this.simulationEntity.dataTreatmentIndType=dataTreatmentIndType;
            return this;
        }
        public SimulationEntityBuilder withCustomerSegmentName(String customerSegmentName){
            this.simulationEntity.customerSegmentName=customerSegmentName;
            return this;
        }

        public SimulationEntity build(){
            return this.simulationEntity;
        }

    }
    public BigDecimal getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public String getInsrncCompanySimulationId() {
        return insrncCompanySimulationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerSimulationDate() {
        return customerSimulationDate;
    }

    public String getCustSimulationExpiredDate() {
        return custSimulationExpiredDate;
    }


    public String getBankFactorType() {
        return bankFactorType;
    }

    public BigDecimal getBankFactorAmount() {
        return bankFactorAmount;
    }

    public BigDecimal getBankFactorPer() {
        return bankFactorPer;
    }

    public String getRegistrySituationType() {
        return registrySituationType;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
    }

    public String getCreationUserId() {
        return creationUserId;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public String getPersonalDocType() {
        return personalDocType;
    }

    public String getParticipantPersonalId() {
        return participantPersonalId;
    }

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public String getDataTreatmentIndType() {
        return dataTreatmentIndType;
    }


    public String getCustomerSegmentName() {
        return customerSegmentName;
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
