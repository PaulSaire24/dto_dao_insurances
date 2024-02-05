package com.bbva.pisd.dto.insurancedao.entities;

public class ReceiptEntity {

    private ContractEntity contract;
    private String insuranceContractEntityId;
    private String insuranceContractBranchId;
    private String insrcContractIntAccountId;
    private Integer policyReceiptId;
    private Integer insuranceCompanyId;
    private String insuranceCompanyReceiptId;
    private Double premiumPaymentReceiptAmount;
    private Double fixingExchangeRateAmount;
    private Double premiumCurrencyExchAmount;
    private Double chargedNetAmount;
    private Double deferredQuotaAmount;
    private String referenceNumberTransDesc;
    private Long premiumChargeOperationId;
    private String currencyId;
    private String receiptIssueDate;
    private String receiptStartDate;
    private String receiptEndDate;
    private String receiptCollectionDate;
    private String receiptExpirationDate;
    private String receiptsTransmissionDate;
    private String receiptCancellationDate;
    private String receiptCollectionStatusType;
    private String writeoffPaymentMarkType;
    private String insuranceCollectionMoveId;
    private String paymentMethodType;
    private String debitAccountId;
    private String debitChannelType;
    private Integer chargeAttemptsNumber;
    private String insrncCoReceiptStatusType;
    private String receiptStatusType;
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;
    private String receiptPymtRefundIndType;
    private String managementBranchId;
    private Double variablePremiumAmount;
    private Double fixPremiumAmount;
    private Double settlementVarPremiumAmount;
    private Double settlementFixPremiumAmount;
    private String lastChangeBranchId;
    private String retentionTrackingId;
    private String paymentNotificationId;
    private String paymentNotificationMsgDesc;
    private String glBranchId;
    private Double fixedAmount;
    private Double variableAmount;
    private boolean wasCommitted;
    private boolean isMissing;
    private Integer renewalReceiptSeqNumber;
    private Integer renewalNumber;
    private String transactionCollectId;
    private String chargeFileSendDate;
    private String commerceReceiptStatusType;

    private String insuranceProductName;
    private String operationGlossaryDesc;

    public String getOperationGlossaryDesc() {
        return operationGlossaryDesc;
    }

    public void setOperationGlossaryDesc(String operationGlossaryDesc) {
        this.operationGlossaryDesc = operationGlossaryDesc;
    }

    public String getInsuranceProductName() {
        return insuranceProductName;
    }

    public void setInsuranceProductName(String insuranceProductName) {
        this.insuranceProductName = insuranceProductName;
    }

    public ContractEntity getContract() {
        return contract;
    }

    public void setContract(ContractEntity contract) {
        this.contract = contract;
    }

    public String getInsuranceContractEntityId() {
        return insuranceContractEntityId;
    }

    public void setInsuranceContractEntityId(String insuranceContractEntityId) {
        this.insuranceContractEntityId = insuranceContractEntityId;
    }

    public String getInsuranceContractBranchId() {
        return insuranceContractBranchId;
    }

    public void setInsuranceContractBranchId(String insuranceContractBranchId) {
        this.insuranceContractBranchId = insuranceContractBranchId;
    }

    public String getInsrcContractIntAccountId() {
        return insrcContractIntAccountId;
    }

    public void setInsrcContractIntAccountId(String insrcContractIntAccountId) {
        this.insrcContractIntAccountId = insrcContractIntAccountId;
    }

    public Integer getPolicyReceiptId() {
        return policyReceiptId;
    }

    public void setPolicyReceiptId(Integer policyReceiptId) {
        this.policyReceiptId = policyReceiptId;
    }

    public Integer getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(Integer insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public String getInsuranceCompanyReceiptId() {
        return insuranceCompanyReceiptId;
    }

    public void setInsuranceCompanyReceiptId(String insuranceCompanyReceiptId) {
        this.insuranceCompanyReceiptId = insuranceCompanyReceiptId;
    }

    public Double getPremiumPaymentReceiptAmount() {
        return premiumPaymentReceiptAmount;
    }

    public void setPremiumPaymentReceiptAmount(Double premiumPaymentReceiptAmount) {
        this.premiumPaymentReceiptAmount = premiumPaymentReceiptAmount;
    }

    public Double getFixingExchangeRateAmount() {
        return fixingExchangeRateAmount;
    }

    public void setFixingExchangeRateAmount(Double fixingExchangeRateAmount) {
        this.fixingExchangeRateAmount = fixingExchangeRateAmount;
    }

    public Double getPremiumCurrencyExchAmount() {
        return premiumCurrencyExchAmount;
    }

    public void setPremiumCurrencyExchAmount(Double premiumCurrencyExchAmount) {
        this.premiumCurrencyExchAmount = premiumCurrencyExchAmount;
    }

    public Double getChargedNetAmount() {
        return chargedNetAmount;
    }

    public void setChargedNetAmount(Double chargedNetAmount) {
        this.chargedNetAmount = chargedNetAmount;
    }

    public Double getDeferredQuotaAmount() {
        return deferredQuotaAmount;
    }

    public void setDeferredQuotaAmount(Double deferredQuotaAmount) {
        this.deferredQuotaAmount = deferredQuotaAmount;
    }

    public String getReferenceNumberTransDesc() {
        return referenceNumberTransDesc;
    }

    public void setReferenceNumberTransDesc(String referenceNumberTransDesc) {
        this.referenceNumberTransDesc = referenceNumberTransDesc;
    }

    public Long getPremiumChargeOperationId() {
        return premiumChargeOperationId;
    }

    public void setPremiumChargeOperationId(Long premiumChargeOperationId) {
        this.premiumChargeOperationId = premiumChargeOperationId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getReceiptIssueDate() {
        return receiptIssueDate;
    }

    public void setReceiptIssueDate(String receiptIssueDate) {
        this.receiptIssueDate = receiptIssueDate;
    }

    public String getReceiptStartDate() {
        return receiptStartDate;
    }

    public void setReceiptStartDate(String receiptStartDate) {
        this.receiptStartDate = receiptStartDate;
    }

    public String getReceiptEndDate() {
        return receiptEndDate;
    }

    public void setReceiptEndDate(String receiptEndDate) {
        this.receiptEndDate = receiptEndDate;
    }

    public String getReceiptCollectionDate() {
        return receiptCollectionDate;
    }

    public void setReceiptCollectionDate(String receiptCollectionDate) {
        this.receiptCollectionDate = receiptCollectionDate;
    }

    public String getReceiptExpirationDate() {
        return receiptExpirationDate;
    }

    public void setReceiptExpirationDate(String receiptExpirationDate) {
        this.receiptExpirationDate = receiptExpirationDate;
    }

    public String getReceiptsTransmissionDate() {
        return receiptsTransmissionDate;
    }

    public void setReceiptsTransmissionDate(String receiptsTransmissionDate) {
        this.receiptsTransmissionDate = receiptsTransmissionDate;
    }

    public String getReceiptCancellationDate() {
        return receiptCancellationDate;
    }

    public void setReceiptCancellationDate(String receiptCancellationDate) {
        this.receiptCancellationDate = receiptCancellationDate;
    }

    public String getReceiptCollectionStatusType() {
        return receiptCollectionStatusType;
    }

    public void setReceiptCollectionStatusType(String receiptCollectionStatusType) {
        this.receiptCollectionStatusType = receiptCollectionStatusType;
    }

    public String getWriteoffPaymentMarkType() {
        return writeoffPaymentMarkType;
    }

    public void setWriteoffPaymentMarkType(String writeoffPaymentMarkType) {
        this.writeoffPaymentMarkType = writeoffPaymentMarkType;
    }

    public String getInsuranceCollectionMoveId() {
        return insuranceCollectionMoveId;
    }

    public void setInsuranceCollectionMoveId(String insuranceCollectionMoveId) {
        this.insuranceCollectionMoveId = insuranceCollectionMoveId;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getDebitAccountId() {
        return debitAccountId;
    }

    public void setDebitAccountId(String debitAccountId) {
        this.debitAccountId = debitAccountId;
    }

    public String getDebitChannelType() {
        return debitChannelType;
    }

    public void setDebitChannelType(String debitChannelType) {
        this.debitChannelType = debitChannelType;
    }

    public Integer getChargeAttemptsNumber() {
        return chargeAttemptsNumber;
    }

    public void setChargeAttemptsNumber(Integer chargeAttemptsNumber) {
        this.chargeAttemptsNumber = chargeAttemptsNumber;
    }

    public String getInsrncCoReceiptStatusType() {
        return insrncCoReceiptStatusType;
    }

    public void setInsrncCoReceiptStatusType(String insrncCoReceiptStatusType) {
        this.insrncCoReceiptStatusType = insrncCoReceiptStatusType;
    }

    public String getReceiptStatusType() {
        return receiptStatusType;
    }

    public void setReceiptStatusType(String receiptStatusType) {
        this.receiptStatusType = receiptStatusType;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public void setUserAuditId(String userAuditId) {
        this.userAuditId = userAuditId;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    public String getReceiptPymtRefundIndType() {
        return receiptPymtRefundIndType;
    }

    public void setReceiptPymtRefundIndType(String receiptPymtRefundIndType) {
        this.receiptPymtRefundIndType = receiptPymtRefundIndType;
    }

    public String getManagementBranchId() {
        return managementBranchId;
    }

    public void setManagementBranchId(String managementBranchId) {
        this.managementBranchId = managementBranchId;
    }

    public Double getVariablePremiumAmount() {
        return variablePremiumAmount;
    }

    public void setVariablePremiumAmount(Double variablePremiumAmount) {
        this.variablePremiumAmount = variablePremiumAmount;
    }

    public Double getFixPremiumAmount() {
        return fixPremiumAmount;
    }

    public void setFixPremiumAmount(Double fixPremiumAmount) {
        this.fixPremiumAmount = fixPremiumAmount;
    }

    public Double getSettlementVarPremiumAmount() {
        return settlementVarPremiumAmount;
    }

    public void setSettlementVarPremiumAmount(Double settlementVarPremiumAmount) {
        this.settlementVarPremiumAmount = settlementVarPremiumAmount;
    }

    public Double getSettlementFixPremiumAmount() {
        return settlementFixPremiumAmount;
    }

    public void setSettlementFixPremiumAmount(Double settlementFixPremiumAmount) {
        this.settlementFixPremiumAmount = settlementFixPremiumAmount;
    }

    public String getLastChangeBranchId() {
        return lastChangeBranchId;
    }

    public void setLastChangeBranchId(String lastChangeBranchId) {
        this.lastChangeBranchId = lastChangeBranchId;
    }

    public String getRetentionTrackingId() {
        return retentionTrackingId;
    }

    public void setRetentionTrackingId(String retentionTrackingId) {
        this.retentionTrackingId = retentionTrackingId;
    }

    public String getPaymentNotificationId() {
        return paymentNotificationId;
    }

    public void setPaymentNotificationId(String paymentNotificationId) {
        this.paymentNotificationId = paymentNotificationId;
    }

    public String getPaymentNotificationMsgDesc() {
        return paymentNotificationMsgDesc;
    }

    public void setPaymentNotificationMsgDesc(String paymentNotificationMsgDesc) {
        this.paymentNotificationMsgDesc = paymentNotificationMsgDesc;
    }

    public String getGlBranchId() {
        return glBranchId;
    }

    public void setGlBranchId(String glBranchId) {
        this.glBranchId = glBranchId;
    }

    public Double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(Double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public Double getVariableAmount() {
        return variableAmount;
    }

    public void setVariableAmount(Double variableAmount) {
        this.variableAmount = variableAmount;
    }

    public boolean isWasCommitted() {
        return wasCommitted;
    }

    public void setWasCommitted(boolean wasCommitted) {
        this.wasCommitted = wasCommitted;
    }

    public boolean isMissing() {
        return isMissing;
    }

    public void setMissing(boolean missing) {
        isMissing = missing;
    }

    public Integer getRenewalReceiptSeqNumber() {
        return renewalReceiptSeqNumber;
    }

    public void setRenewalReceiptSeqNumber(Integer renewalReceiptSeqNumber) {
        this.renewalReceiptSeqNumber = renewalReceiptSeqNumber;
    }

    public Integer getRenewalNumber() {
        return renewalNumber;
    }

    public void setRenewalNumber(Integer renewalNumber) {
        this.renewalNumber = renewalNumber;
    }

    public String getTransactionCollectId() {
        return transactionCollectId;
    }

    public void setTransactionCollectId(String transactionCollectId) {
        this.transactionCollectId = transactionCollectId;
    }

    public String getChargeFileSendDate() {
        return chargeFileSendDate;
    }

    public void setChargeFileSendDate(String chargeFileSendDate) {
        this.chargeFileSendDate = chargeFileSendDate;
    }

    public String getCommerceReceiptStatusType() {
        return commerceReceiptStatusType;
    }

    public void setCommerceReceiptStatusType(String commerceReceiptStatusType) {
        this.commerceReceiptStatusType = commerceReceiptStatusType;
    }

    public static final class Builder {
        private ReceiptEntity receiptDTO;

        private Builder() {
            this.receiptDTO = new ReceiptEntity();
        }
        public static Builder an() {
            return new Builder();
        }

        public Builder withContract(ContractEntity contract) {
            this.receiptDTO.setContract(contract);
            return this;
        }
        public Builder withInsuranceContractEntityId(String insuranceContractEntityId) {
            this.receiptDTO.setInsuranceContractEntityId(insuranceContractEntityId);
            return this;
        }

        public Builder withInsuranceContractBranchId(String insuranceContractBranchId) {
            this.receiptDTO.setInsuranceContractBranchId(insuranceContractBranchId);
            return this;
        }

        public Builder withInsrcContractIntAccountId(String insrcContractIntAccountId) {
            this.receiptDTO.setInsrcContractIntAccountId(insrcContractIntAccountId);
            return this;
        }

        public Builder withPolicyReceiptId(Integer policyReceiptId) {
            this.receiptDTO.setPolicyReceiptId(policyReceiptId);
            return this;
        }
        public Builder withInsuranceCompanyReceiptId(String insuranceCompanyReceiptId) {
            this.receiptDTO.setInsuranceCompanyReceiptId(insuranceCompanyReceiptId);
            return this;
        }

        public Builder withPremiumPaymentReceiptAmount(Double premiumPaymentReceiptAmount) {
            this.receiptDTO.setPremiumPaymentReceiptAmount(premiumPaymentReceiptAmount);
            return this;
        }

        public Builder withCurrencyId(String currencyId) {
            this.receiptDTO.setCurrencyId(currencyId);
            return this;
        }

        public Builder withReceiptStatusType(String receiptStatusType) {
            this.receiptDTO.setReceiptStatusType(receiptStatusType);
            return this;
        }
        public Builder withReceiptCollectionStatusType(String receiptCollectionStatusType) {
            this.receiptDTO.setReceiptCollectionStatusType(receiptCollectionStatusType);
            return this;
        }
        public Builder withFixingExchangeRateAmount(Double fixingExchangeRateAmount) {
            this.receiptDTO.setFixingExchangeRateAmount(fixingExchangeRateAmount);
            return this;
        }
        public Builder withPremiumCurrencyExchAmount(Double premiumCurrencyExchAmount) {
            this.receiptDTO.setPremiumCurrencyExchAmount(premiumCurrencyExchAmount);
            return this;
        }
        public Builder withPremiumChargeOperationId(Long premiumChargeOperationId) {
            this.receiptDTO.setPremiumChargeOperationId(premiumChargeOperationId);
            return this;
        }
        public Builder withDebitAccountId(String debitAccountId) {
            this.receiptDTO.setDebitAccountId(debitAccountId);
            return this;
        }
        public Builder withChargeAttemptsNumber(Integer chargeAttemptsNumber) {
            this.receiptDTO.setChargeAttemptsNumber(chargeAttemptsNumber);
            return this;
        }
        public Builder withReceiptsTransmissionDate(String receiptsTransmissionDate) {
            this.receiptDTO.setReceiptsTransmissionDate(receiptsTransmissionDate);
            return this;
        }
        public Builder withRetentionTrackingId(String retentionTrackingId) {
            this.receiptDTO.setRetentionTrackingId(retentionTrackingId);
            return this;
        }
        public Builder withManagementBranchId(String managementBranchId) {
            this.receiptDTO.setManagementBranchId(managementBranchId);
            return this;
        }
        public Builder withPaymentNotificationId(String paymentNotificationId) {
            this.receiptDTO.setPaymentNotificationId(paymentNotificationId);
            return this;
        }
        public Builder withPaymentNotificationMsgDesc(String paymentNotificationMsgDesc) {
            this.receiptDTO.setPaymentNotificationMsgDesc(paymentNotificationMsgDesc);
            return this;
        }
        public Builder withInsuranceProductName(String insuranceProductName) {
            this.receiptDTO.setInsuranceProductName(insuranceProductName);
            return this;
        }
        public Builder withUserAuditId(String userAuditId) {
            this.receiptDTO.setUserAuditId(userAuditId);
            return this;
        }
        public Builder withAuditDate(String auditDate) {
            this.receiptDTO.setAuditDate(auditDate);
            return this;
        }
        public Builder withOperationGlossaryDesc(String glosa) {
            this.receiptDTO.setOperationGlossaryDesc(glosa);
            return this;
        }


        public ReceiptEntity build() {
            return this.receiptDTO;
        }

    }

    @Override
    public String toString() {
        return "ReceiptEntity{" +
                "contract=" + contract +
                ", insuranceContractEntityId='" + insuranceContractEntityId + '\'' +
                ", insuranceContractBranchId='" + insuranceContractBranchId + '\'' +
                ", insrcContractIntAccountId='" + insrcContractIntAccountId + '\'' +
                ", policyReceiptId=" + policyReceiptId +
                ", insuranceCompanyId=" + insuranceCompanyId +
                ", insuranceCompanyReceiptId='" + insuranceCompanyReceiptId + '\'' +
                ", premiumPaymentReceiptAmount=" + premiumPaymentReceiptAmount +
                ", fixingExchangeRateAmount=" + fixingExchangeRateAmount +
                ", premiumCurrencyExchAmount=" + premiumCurrencyExchAmount +
                ", chargedNetAmount=" + chargedNetAmount +
                ", deferredQuotaAmount=" + deferredQuotaAmount +
                ", referenceNumberTransDesc='" + referenceNumberTransDesc + '\'' +
                ", premiumChargeOperationId=" + premiumChargeOperationId +
                ", currencyId='" + currencyId + '\'' +
                ", receiptIssueDate='" + receiptIssueDate + '\'' +
                ", receiptStartDate='" + receiptStartDate + '\'' +
                ", receiptEndDate='" + receiptEndDate + '\'' +
                ", receiptCollectionDate='" + receiptCollectionDate + '\'' +
                ", receiptExpirationDate='" + receiptExpirationDate + '\'' +
                ", receiptsTransmissionDate='" + receiptsTransmissionDate + '\'' +
                ", receiptCancellationDate='" + receiptCancellationDate + '\'' +
                ", receiptCollectionStatusType='" + receiptCollectionStatusType + '\'' +
                ", writeoffPaymentMarkType='" + writeoffPaymentMarkType + '\'' +
                ", insuranceCollectionMoveId='" + insuranceCollectionMoveId + '\'' +
                ", paymentMethodType='" + paymentMethodType + '\'' +
                ", debitAccountId='" + debitAccountId + '\'' +
                ", debitChannelType='" + debitChannelType + '\'' +
                ", chargeAttemptsNumber=" + chargeAttemptsNumber +
                ", insrncCoReceiptStatusType='" + insrncCoReceiptStatusType + '\'' +
                ", receiptStatusType='" + receiptStatusType + '\'' +
                ", creationUserId='" + creationUserId + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                ", auditDate='" + auditDate + '\'' +
                ", receiptPymtRefundIndType='" + receiptPymtRefundIndType + '\'' +
                ", managementBranchId='" + managementBranchId + '\'' +
                ", variablePremiumAmount=" + variablePremiumAmount +
                ", fixPremiumAmount=" + fixPremiumAmount +
                ", settlementVarPremiumAmount=" + settlementVarPremiumAmount +
                ", settlementFixPremiumAmount=" + settlementFixPremiumAmount +
                ", lastChangeBranchId='" + lastChangeBranchId + '\'' +
                ", retentionTrackingId='" + retentionTrackingId + '\'' +
                ", paymentNotificationId='" + paymentNotificationId + '\'' +
                ", paymentNotificationMsgDesc='" + paymentNotificationMsgDesc + '\'' +
                ", glBranchId='" + glBranchId + '\'' +
                ", fixedAmount=" + fixedAmount +
                ", variableAmount=" + variableAmount +
                ", wasCommitted=" + wasCommitted +
                ", isMissing=" + isMissing +
                ", renewalReceiptSeqNumber=" + renewalReceiptSeqNumber +
                ", renewalNumber=" + renewalNumber +
                ", transactionCollectId='" + transactionCollectId + '\'' +
                '}';
    }
}
