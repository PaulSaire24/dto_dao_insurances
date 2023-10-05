package com.bbva.pisd.dto.insurancedao.entities;

import java.util.Date;

public class ProcessedDetlEntity {
    private ProcessedDetlEntity() {
    }
    private String procId;
    private String processExecutionDate;
    private Date auditDate;
    private Date creationDate;
    private String creationUserId;
    private String insrcContractIntAccountId;
    private String insuranceContractBranchId;
    private String insuranceContractEntityId;
    private Integer policyReceiptId;
    private String registrySituationType;
    private String userAuditId;

    public String getProcId() {
        return procId;
    }

    public String getProcessExecutionDate() {
        return processExecutionDate;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public String getInsrcContractIntAccountId() {
        return insrcContractIntAccountId;
    }

    public String getInsuranceContractBranchId() {
        return insuranceContractBranchId;
    }

    public String getInsuranceContractEntityId() {
        return insuranceContractEntityId;
    }

    public Integer getPolicyReceiptId() {
        return policyReceiptId;
    }

    public String getRegistrySituationType() {
        return registrySituationType;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public static final class ProcessedBuilder {
        private ProcessedDetlEntity processedDetlEntity;
        public ProcessedBuilder() {
            this.processedDetlEntity = new ProcessedDetlEntity();
        }
        public static ProcessedDetlEntity.ProcessedBuilder an(){
            return new ProcessedBuilder();
        }

        public ProcessedDetlEntity.ProcessedBuilder withProcId(String procId){
            this.processedDetlEntity.procId=procId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withProcessExecutionDate(String processExecutionDate){
            this.processedDetlEntity.processExecutionDate=processExecutionDate;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withAuditDate(Date auditDate){
            this.processedDetlEntity.auditDate=auditDate;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withCreationDate(Date creationDate){
            this.processedDetlEntity.creationDate=creationDate;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withCreationUserId(String creationUserId){
            this.processedDetlEntity.creationUserId=creationUserId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withInsrcContractIntAccountId(String insrcContractIntAccountId){
            this.processedDetlEntity.insrcContractIntAccountId=insrcContractIntAccountId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withInsuranceContractBranchId(String insuranceContractBranchId){
            this.processedDetlEntity.insuranceContractBranchId=insuranceContractBranchId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withInsuranceContractEntityId(String insuranceContractEntityId){
            this.processedDetlEntity.insuranceContractEntityId=insuranceContractEntityId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withPolicyReceiptId(Integer policyReceiptId){
            this.processedDetlEntity.policyReceiptId=policyReceiptId;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withRegistrySituationType(String registrySituationType){
            this.processedDetlEntity.registrySituationType=registrySituationType;
            return this;
        }
        public ProcessedDetlEntity.ProcessedBuilder withUserAuditId(String userAuditId){
            this.processedDetlEntity.userAuditId=userAuditId;
            return this;
        }
        public ProcessedDetlEntity build(){
            return this.processedDetlEntity;
        }


    }

    @Override
    public String toString() {
        return "ProcessedDetlEntity{" +
                "procId='" + procId + '\'' +
                ", processExecutionDate='" + processExecutionDate + '\'' +
                ", auditDate=" + auditDate +
                ", creationDate=" + creationDate +
                ", creationUserId='" + creationUserId + '\'' +
                ", insrcContractIntAccountId='" + insrcContractIntAccountId + '\'' +
                ", insuranceContractBranchId='" + insuranceContractBranchId + '\'' +
                ", insuranceContractEntityId='" + insuranceContractEntityId + '\'' +
                ", policyReceiptId=" + policyReceiptId +
                ", registrySituationType='" + registrySituationType + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                '}';
    }
}
