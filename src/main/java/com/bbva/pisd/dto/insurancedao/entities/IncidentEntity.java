package com.bbva.pisd.dto.insurancedao.entities;
public class IncidentEntity {
    private IncidentEntity() {
    }

    private String insuranceContractEntityId;
    private String insuranceContractBranchId;
    private String insrcContractIntAccountId;
    private String operationDate;
    private String incidenceErrorId;
    private String incidenceErrorDesc;
    private Integer policyReceiptId;
    private Double realOperationAmount;
    private String authOriginCurncyId;
    private Double operationAdditionalAmount;
    private String debitAccountId;
    private String glAccountDate;
    private String channelTypeId;
    private String operationStatusId;
    private String creationTransactionId;
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;

    public String getInsuranceContractEntityId() {
        return insuranceContractEntityId;
    }

    public String getInsuranceContractBranchId() {
        return insuranceContractBranchId;
    }

    public String getInsrcContractIntAccountId() {
        return insrcContractIntAccountId;
    }

    public String getOperationDate() {
        return operationDate;
    }
    public String getIncidenceErrorId() {
        return incidenceErrorId;
    }
    public String getIncidenceErrorDesc() {
        return incidenceErrorDesc;
    }
    public Integer getPolicyReceiptId() {
        return policyReceiptId;
    }
    public Double getRealOperationAmount() {
        return realOperationAmount;
    }
    public String getAuthOriginCurncyId() {
        return authOriginCurncyId;
    }
    public Double getOperationAdditionalAmount() {
        return operationAdditionalAmount;
    }
    public String getDebitAccountId() {
        return debitAccountId;
    }
    public String getGlAccountDate() {
        return glAccountDate;
    }
    public String getChannelTypeId() {
        return channelTypeId;
    }
    public String getOperationStatusId() {
        return operationStatusId;
    }
    public String getCreationTransactionId() {
        return creationTransactionId;
    }
    public String getCreationUserId() {
        return creationUserId;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public String getUserAuditId() {
        return userAuditId;
    }
    public String getAuditDate() {
        return auditDate;
    }
    public static final class IncidentBuilder{
        private IncidentEntity incident;

        public IncidentBuilder() {
            this.incident = new IncidentEntity();
        }
        public static IncidentBuilder an(){
            return new IncidentBuilder();
        }

        public IncidentBuilder withInsuranceContractEntityId(String contractEntityId){
            this.incident.insuranceContractEntityId=contractEntityId;
            return this;
        }
        public IncidentBuilder withInsuranceContractBranchId(String insuranceContractBranchId){
            this.incident.insuranceContractBranchId=insuranceContractBranchId;
            return this;
        }
        public IncidentBuilder withInsrcContractIntAccountId(String insrcContractIntAccountId){
            this.incident.insrcContractIntAccountId=insrcContractIntAccountId;
            return this;
        }
        public IncidentBuilder withOperationDate(String operationDate){
            this.incident.operationDate=operationDate;
            return this;
        }
        public IncidentBuilder withIncidenceErrorId(String incidenceErrorId){
            this.incident.incidenceErrorId=incidenceErrorId;
            return this;
        }
        public IncidentBuilder withIncidenceErrorDesc(String incidenceErrorDesc){
            this.incident.incidenceErrorDesc=incidenceErrorDesc;
            return this;
        }
        public IncidentBuilder withPolicyReceiptId(Integer policyReceiptId){
            this.incident.policyReceiptId=policyReceiptId;
            return this;
        }
        public IncidentBuilder withRealOperationAmount(Double realOperationAmount){
            this.incident.realOperationAmount = realOperationAmount;
            return this;
        }
        public IncidentBuilder withauthOriginCurncyId(String authOriginCurncyId){
            this.incident.authOriginCurncyId=authOriginCurncyId;
            return this;
        }
        public IncidentBuilder withOperationAdditionalAmount(Double operationAdditionalAmount){
            this.incident.operationAdditionalAmount=operationAdditionalAmount;
            return this;
        }
        public IncidentBuilder withDebitAccountId(String debitAccountId){
            this.incident.debitAccountId=debitAccountId;
            return this;
        }
        public IncidentBuilder withGlAccountDate(String glAccountDate){
            this.incident.glAccountDate=glAccountDate;
            return this;
        }
        public IncidentBuilder withChannelTypeId(String channelTypeId){
            this.incident.channelTypeId=channelTypeId;
            return this;
        }
        public IncidentBuilder withOperationStatusId(String operationStatusId){
            this.incident.operationStatusId=operationStatusId;
            return this;
        }
        public IncidentBuilder withCreationDate(String creationDate){
            this.incident.creationDate=creationDate;
            return this;
        }
        public IncidentBuilder withCreationUserId(String creationUserId){
            this.incident.creationUserId=creationUserId;
            return this;
        }
        public IncidentBuilder withCreationTransactionId(String creationTransactionId){
            this.incident.creationTransactionId=creationTransactionId;
            return this;
        }
        public IncidentBuilder withUserAuditId(String userAuditId){
            this.incident.userAuditId=userAuditId;
            return this;
        }
        public IncidentBuilder withAuditDate(String auditDate){
            this.incident.auditDate=auditDate;
            return this;
        }

        public IncidentEntity build(){
            return this.incident;
        }
    }
    @Override
    public String toString() {
        return "IncidentEntity{" +
                "insuranceContractEntityId='" + insuranceContractEntityId + '\'' +
                ", insuranceContractBranchId='" + insuranceContractBranchId + '\'' +
                ", insrcContractIntAccountId='" + insrcContractIntAccountId + '\'' +
                ", operationDate='" + operationDate + '\'' +
                ", incidenceErrorId='" + incidenceErrorId + '\'' +
                ", incidenceErrorDesc='" + incidenceErrorDesc + '\'' +
                ", policyReceiptId=" + policyReceiptId +
                ", realOperationAmount=" + realOperationAmount +
                ", authOriginCurncyId='" + authOriginCurncyId + '\'' +
                ", operationAdditionalAmount=" + operationAdditionalAmount +
                ", debitAccountId='" + debitAccountId + '\'' +
                ", glAccountDate='" + glAccountDate + '\'' +
                ", channelTypeId='" + channelTypeId + '\'' +
                ", operationStatusId='" + operationStatusId + '\'' +
                ", creationTransactionId='" + creationTransactionId + '\'' +
                ", creationUserId='" + creationUserId + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                ", auditDate='" + auditDate + '\'' +
                '}';
    }
}