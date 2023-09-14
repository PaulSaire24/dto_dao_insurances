package com.bbva.pisd.dto.insurancedao.entities;

public class ContractEntity {
    private ContractEntity() {}
    /**
     * Propiedades de auditoria
     * @creationUserId
     * @creationDate
     * @userAuditId
     * @auditDate
     */
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;
    /**
     * Campos necesarios para el certificado banco
     * @insuranceContractEntityId
     * @insuranceContractBranchId
     * @contractFirstVerfnDigitId
     * @contractSecondVerfnDigitId
     * @insrcContractIntAccountId
     */
    private String insuranceContractEntityId;
    private String insuranceContractBranchId;
    private String contractFirstVerfnDigitId;
    private String contractSecondVerfnDigitId;
    private String insrcContractIntAccountId;

    /**
     * Propiedades de la poliza
     */
    private String policyQuotaInternalId;
    private String policyId;
    private String insurancePolicyEndDate;
    private String policyAnnulationDate;
    private String policyFeeAmount;
    private String policyDiscountCouponId;
    private String endorsementPolicyIndType;

    /**
     * Propiedades sobre producto
     */
    private String insuranceProductId;


    private String insuranceModalityType;
    private String insuranceCompanyId;

    private String insuranceManagerId;
    private String insurancePromoterId;
    private String contractManagerBranchId;
    private String contractInceptionDate;
    private String insuranceContractStartDate;
    private String insuranceContractEndDate;
    private String insrncValidityMonthsNumber;

    private String aftrReprgPendingInstNumber;
    private String contractRegisCstAgeNumber;
    private String customerId;
    private String domicileContractId;
    private String cardIssuingMarkType;
    private String issuedReceiptNumber;
    private String paymentFrequencyId;
    private String premiumAmount;
    private String netPremPlcyOrigCurrAmount;
    private String settlePendingPremiumAmount;

    private String currencyId;
    private String lastInstallmentDate;
    private String installmentPeriodFinalDate;
    private String insuredAmount;
    private String beneficiaryType;
    private String renewalNumber;
    private String nextRenewalStartDate;
    private String ctrctDisputeStatusType;
    private String contractPreviousBranchId;
    private String periodNextPaymentDate;
    private String contPreviousSituationType;

    private String insrncCoContractStatusType;
    private String contractStatusId;
    private String insurPendingDebtIndType;
    private String totalDebtAmount;
    private String prevPendBillRcptsNumber;
    private String settlementVarPremiumAmount;
    private String settlementFixPremiumAmount;
    private String insuranceCompanyProductId;
    private String automaticDebitIndicatorType;
    private String biometryTransactionId;
    private String telemarketingTransactionId;
    private String  dataTreatmentIndType;
    private String  contractAcceptanceIndType;
    private String  contractNonCnclIndType;
    private String  saleChannelId;
    private String  contractRenewalStatusType;
    private String  contractRenewalSendingDate;
    private String  contractRenewalReceiptDate;
    private String  insrncCompanyRenwlPrpslId;
    private String  insrcCompanyRenwlRspseDesc;

    private String  nonRenewedCtrctReasontype;
    private String  nonRenwCtrctSubReasonType;
    private String  originalPaymentSubChannelId;
    private String  processedRegisterType;

    /**
     * Campos de OpenPay
     */
    private String  tokenSupplierId;
    private String openpayCommerceTransDate;
    private String paymentMeansType;

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

    public String getInsuranceContractEntityId() {
        return insuranceContractEntityId;
    }

    public String getInsuranceContractBranchId() {
        return insuranceContractBranchId;
    }

    public String getContractFirstVerfnDigitId() {
        return contractFirstVerfnDigitId;
    }

    public String getContractSecondVerfnDigitId() {
        return contractSecondVerfnDigitId;
    }

    public String getInsrcContractIntAccountId() {
        return insrcContractIntAccountId;
    }

    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getInsurancePolicyEndDate() {
        return insurancePolicyEndDate;
    }

    public String getPolicyAnnulationDate() {
        return policyAnnulationDate;
    }

    public String getPolicyFeeAmount() {
        return policyFeeAmount;
    }

    public String getPolicyDiscountCouponId() {
        return policyDiscountCouponId;
    }

    public String getEndorsementPolicyIndType() {
        return endorsementPolicyIndType;
    }

    public String getInsuranceProductId() {
        return insuranceProductId;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public String getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public String getInsuranceManagerId() {
        return insuranceManagerId;
    }

    public String getInsurancePromoterId() {
        return insurancePromoterId;
    }

    public String getContractManagerBranchId() {
        return contractManagerBranchId;
    }

    public String getContractInceptionDate() {
        return contractInceptionDate;
    }

    public String getInsuranceContractStartDate() {
        return insuranceContractStartDate;
    }

    public String getInsuranceContractEndDate() {
        return insuranceContractEndDate;
    }

    public String getInsrncValidityMonthsNumber() {
        return insrncValidityMonthsNumber;
    }

    public String getAftrReprgPendingInstNumber() {
        return aftrReprgPendingInstNumber;
    }

    public String getContractRegisCstAgeNumber() {
        return contractRegisCstAgeNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getDomicileContractId() {
        return domicileContractId;
    }

    public String getCardIssuingMarkType() {
        return cardIssuingMarkType;
    }

    public String getIssuedReceiptNumber() {
        return issuedReceiptNumber;
    }

    public String getPaymentFrequencyId() {
        return paymentFrequencyId;
    }

    public String getPremiumAmount() {
        return premiumAmount;
    }

    public String getNetPremPlcyOrigCurrAmount() {
        return netPremPlcyOrigCurrAmount;
    }

    public String getSettlePendingPremiumAmount() {
        return settlePendingPremiumAmount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public String getLastInstallmentDate() {
        return lastInstallmentDate;
    }

    public String getInstallmentPeriodFinalDate() {
        return installmentPeriodFinalDate;
    }

    public String getInsuredAmount() {
        return insuredAmount;
    }

    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    public String getRenewalNumber() {
        return renewalNumber;
    }

    public String getNextRenewalStartDate() {
        return nextRenewalStartDate;
    }

    public String getCtrctDisputeStatusType() {
        return ctrctDisputeStatusType;
    }

    public String getContractPreviousBranchId() {
        return contractPreviousBranchId;
    }

    public String getPeriodNextPaymentDate() {
        return periodNextPaymentDate;
    }

    public String getContPreviousSituationType() {
        return contPreviousSituationType;
    }

    public String getInsrncCoContractStatusType() {
        return insrncCoContractStatusType;
    }

    public String getContractStatusId() {
        return contractStatusId;
    }

    public String getInsurPendingDebtIndType() {
        return insurPendingDebtIndType;
    }

    public String getTotalDebtAmount() {
        return totalDebtAmount;
    }

    public String getPrevPendBillRcptsNumber() {
        return prevPendBillRcptsNumber;
    }

    public String getSettlementVarPremiumAmount() {
        return settlementVarPremiumAmount;
    }

    public String getSettlementFixPremiumAmount() {
        return settlementFixPremiumAmount;
    }

    public String getInsuranceCompanyProductId() {
        return insuranceCompanyProductId;
    }

    public String getAutomaticDebitIndicatorType() {
        return automaticDebitIndicatorType;
    }

    public String getBiometryTransactionId() {
        return biometryTransactionId;
    }

    public String getTelemarketingTransactionId() {
        return telemarketingTransactionId;
    }

    public String getDataTreatmentIndType() {
        return dataTreatmentIndType;
    }

    public String getContractAcceptanceIndType() {
        return contractAcceptanceIndType;
    }

    public String getContractNonCnclIndType() {
        return contractNonCnclIndType;
    }

    public String getSaleChannelId() {
        return saleChannelId;
    }

    public String getContractRenewalStatusType() {
        return contractRenewalStatusType;
    }

    public String getContractRenewalSendingDate() {
        return contractRenewalSendingDate;
    }

    public String getContractRenewalReceiptDate() {
        return contractRenewalReceiptDate;
    }

    public String getInsrncCompanyRenwlPrpslId() {
        return insrncCompanyRenwlPrpslId;
    }

    public String getInsrcCompanyRenwlRspseDesc() {
        return insrcCompanyRenwlRspseDesc;
    }

    public String getNonRenewedCtrctReasontype() {
        return nonRenewedCtrctReasontype;
    }

    public String getNonRenwCtrctSubReasonType() {
        return nonRenwCtrctSubReasonType;
    }

    public String getOriginalPaymentSubChannelId() {
        return originalPaymentSubChannelId;
    }

    public String getProcessedRegisterType() {
        return processedRegisterType;
    }

    public String getTokenSupplierId() {
        return tokenSupplierId;
    }

    public String getOpenpayCommerceTransDate() {
        return openpayCommerceTransDate;
    }

    public String getPaymentMeansType() {
        return paymentMeansType;
    }

    public static final class ContractBuilder{
        private ContractEntity contractEntity;
        public ContractBuilder() {
            this.contractEntity = new ContractEntity();
        }
        public static ContractBuilder an(){
            return new ContractBuilder();
        }
        public ContractBuilder withCreationUserId(String creationUserId) {
            contractEntity.creationUserId = creationUserId;
            return this;
        }

        public ContractBuilder withCreationDate(String creationDate) {
            contractEntity.creationDate = creationDate;
            return this;
        }
        public ContractBuilder withUserAuditId(String userAuditId) {
            contractEntity.userAuditId = userAuditId;
            return this;
        }
        public ContractBuilder withAuditDate(String auditDate) {
            contractEntity.auditDate = auditDate;
            return this;
        }
        public ContractBuilder withInsuranceContractEntityId(String insuranceContractEntityId) {
            contractEntity.insuranceContractEntityId = insuranceContractEntityId;
            return this;
        }
        public ContractBuilder withInsuranceContractBranchId(String insuranceContractBranchId) {
            contractEntity.insuranceContractBranchId = insuranceContractBranchId;
            return this;
        }
        public ContractBuilder withContractFirstVerfnDigitId(String contractFirstVerfnDigitId) {
            contractEntity.contractFirstVerfnDigitId = contractFirstVerfnDigitId;
            return this;
        }
        public ContractBuilder withContractSecondVerfnDigitId(String contractSecondVerfnDigitId) {
            contractEntity.contractSecondVerfnDigitId = contractSecondVerfnDigitId;
            return this;
        }
        public ContractBuilder withInsrcContractIntAccountId(String insrcContractIntAccountId) {
            contractEntity.insrcContractIntAccountId = insrcContractIntAccountId;
            return this;
        }
        public ContractBuilder withPolicyQuotaInternalId(String policyQuotaInternalId) {
            contractEntity.policyQuotaInternalId = policyQuotaInternalId;
            return this;
        }
        public ContractBuilder withPolicyId(String policyId) {
            contractEntity.policyId = policyId;
            return this;
        }
        public ContractBuilder withInsurancePolicyEndDate(String insurancePolicyEndDate) {
            contractEntity.insurancePolicyEndDate = insurancePolicyEndDate;
            return this;
        }
        public ContractBuilder withPolicyAnnulationDate(String policyAnnulationDate) {
            contractEntity.policyAnnulationDate = policyAnnulationDate;
            return this;
        }
        public ContractBuilder withPolicyFeeAmount(String policyFeeAmount) {
            contractEntity.policyFeeAmount = policyFeeAmount;
            return this;
        }
        public ContractBuilder withPolicyDiscountCouponId(String policyDiscountCouponId) {
            contractEntity.policyDiscountCouponId = policyDiscountCouponId;
            return this;
        }
        public ContractBuilder withEndorsementPolicyIndType(String endorsementPolicyIndType) {
            contractEntity.endorsementPolicyIndType = endorsementPolicyIndType;
            return this;
        }
        public ContractBuilder withInsuranceProductId(String insuranceProductId) {
            contractEntity.insuranceProductId = insuranceProductId;
            return this;
        }
        public ContractBuilder withInsuranceModalityType(String insuranceModalityType) {
            contractEntity.insuranceModalityType = insuranceModalityType;
            return this;
        }
        public ContractBuilder withInsuranceCompanyId(String insuranceCompanyId) {
            contractEntity.insuranceCompanyId = insuranceCompanyId;
            return this;
        }
        public ContractBuilder withInsuranceManagerId(String insuranceManagerId) {
            contractEntity.insuranceManagerId = insuranceManagerId;
            return this;
        }
        public ContractBuilder withInsurancePromoterId(String insurancePromoterId) {
            contractEntity.insurancePromoterId = insurancePromoterId;
            return this;
        }
        public ContractBuilder withContractManagerBranchId(String contractManagerBranchId) {
            contractEntity.contractManagerBranchId = contractManagerBranchId;
            return this;
        }
        public ContractBuilder withContractInceptionDate(String contractInceptionDate) {
            contractEntity.contractInceptionDate = contractInceptionDate;
            return this;
        }
        public ContractBuilder withInsuranceContractStartDate(String insuranceContractStartDate) {
            contractEntity.insuranceContractStartDate = insuranceContractStartDate;
            return this;
        }
        public ContractBuilder withInsuranceContractEndDate(String insuranceContractEndDate) {
            contractEntity.insuranceContractEndDate = insuranceContractEndDate;
            return this;
        }
        public ContractBuilder withInsrncValidityMonthsNumber(String insrncValidityMonthsNumber) {
            contractEntity.insrncValidityMonthsNumber = insrncValidityMonthsNumber;
            return this;
        }
        public ContractBuilder withAftrReprgPendingInstNumber(String aftrReprgPendingInstNumber) {
            contractEntity.aftrReprgPendingInstNumber = aftrReprgPendingInstNumber;
            return this;
        }
        public ContractBuilder withContractRegisCstAgeNumber(String contractRegisCstAgeNumber) {
            contractEntity.contractRegisCstAgeNumber = contractRegisCstAgeNumber;
            return this;
        }
        public ContractBuilder withCustomerId(String customerId) {
            contractEntity.customerId = customerId;
            return this;
        }
        public ContractBuilder withDomicileContractId(String domicileContractId) {
            contractEntity.domicileContractId = domicileContractId;
            return this;
        }
        public ContractBuilder withCardIssuingMarkType(String cardIssuingMarkType) {
            contractEntity.cardIssuingMarkType = cardIssuingMarkType;
            return this;
        }
        public ContractBuilder withIssuedReceiptNumber(String issuedReceiptNumber) {
            contractEntity.issuedReceiptNumber = issuedReceiptNumber;
            return this;
        }
        public ContractBuilder withPaymentFrequencyId(String paymentFrequencyId) {
            contractEntity.paymentFrequencyId = paymentFrequencyId;
            return this;
        }
        public ContractBuilder withPremiumAmount(String premiumAmount) {
            contractEntity.premiumAmount = premiumAmount;
            return this;
        }
        public ContractBuilder withNetPremPlcyOrigCurrAmount(String netPremPlcyOrigCurrAmount) {
            contractEntity.netPremPlcyOrigCurrAmount = netPremPlcyOrigCurrAmount;
            return this;
        }
        public ContractBuilder withSettlePendingPremiumAmount(String settlePendingPremiumAmount) {
            contractEntity.settlePendingPremiumAmount = settlePendingPremiumAmount;
            return this;
        }
        public ContractBuilder withCurrencyId(String currencyId) {
            contractEntity.currencyId = currencyId;
            return this;
        }
        public ContractBuilder withLastInstallmentDate(String lastInstallmentDate) {
            contractEntity.lastInstallmentDate = lastInstallmentDate;
            return this;
        }
        public ContractBuilder withInstallmentPeriodFinalDate(String installmentPeriodFinalDate) {
            contractEntity.installmentPeriodFinalDate = installmentPeriodFinalDate;
            return this;
        }
        public ContractBuilder withInsuredAmount(String insuredAmount) {
            contractEntity.insuredAmount = insuredAmount;
            return this;
        }
        public ContractBuilder withBeneficiaryType(String beneficiaryType) {
            contractEntity.beneficiaryType = beneficiaryType;
            return this;
        }
        public ContractBuilder withRenewalNumber(String renewalNumber) {
            contractEntity.renewalNumber = renewalNumber;
            return this;
        }
        public ContractBuilder withNextRenewalStartDate(String nextRenewalStartDate) {
            contractEntity.nextRenewalStartDate = nextRenewalStartDate;
            return this;
        }
        public ContractBuilder withCtrctDisputeStatusType(String ctrctDisputeStatusType) {
            contractEntity.ctrctDisputeStatusType = ctrctDisputeStatusType;
            return this;
        }
        public ContractBuilder withContractPreviousBranchId(String contractPreviousBranchId) {
            contractEntity.contractPreviousBranchId = contractPreviousBranchId;
            return this;
        }
        public ContractBuilder withPeriodNextPaymentDate(String periodNextPaymentDate) {
            contractEntity.periodNextPaymentDate = periodNextPaymentDate;
            return this;
        }
        public ContractBuilder withContPreviousSituationType(String contPreviousSituationType) {
            contractEntity.contPreviousSituationType = contPreviousSituationType;
            return this;
        }
        public ContractBuilder withInsrncCoContractStatusType(String insrncCoContractStatusType) {
            contractEntity.insrncCoContractStatusType = insrncCoContractStatusType;
            return this;
        }
        public ContractBuilder withContractStatusId(String contractStatusId) {
            contractEntity.contractStatusId = contractStatusId;
            return this;
        }
        public ContractBuilder withInsurPendingDebtIndType(String insurPendingDebtIndType) {
            contractEntity.insurPendingDebtIndType = insurPendingDebtIndType;
            return this;
        }
        public ContractBuilder withTotalDebtAmount(String totalDebtAmount) {
            contractEntity.totalDebtAmount = totalDebtAmount;
            return this;
        }
        public ContractBuilder withPrevPendBillRcptsNumber(String prevPendBillRcptsNumber) {
            contractEntity.prevPendBillRcptsNumber = prevPendBillRcptsNumber;
            return this;
        }
        public ContractBuilder withSettlementVarPremiumAmount(String settlementVarPremiumAmount) {
            contractEntity.settlementVarPremiumAmount = settlementVarPremiumAmount;
            return this;
        }
        public ContractBuilder withSettlementFixPremiumAmount(String settlementFixPremiumAmount) {
            contractEntity.settlementFixPremiumAmount = settlementFixPremiumAmount;
            return this;
        }
        public ContractBuilder withInsuranceCompanyProductId(String insuranceCompanyProductId) {
            contractEntity.insuranceCompanyProductId = insuranceCompanyProductId;
            return this;
        }
        public ContractBuilder withAutomaticDebitIndicatorType(String automaticDebitIndicatorType) {
            contractEntity.automaticDebitIndicatorType = automaticDebitIndicatorType;
            return this;
        }
        public ContractBuilder withBiometryTransactionId(String biometryTransactionId) {
            contractEntity.biometryTransactionId = biometryTransactionId;
            return this;
        }
        public ContractBuilder withTelemarketingTransactionId(String telemarketingTransactionId) {
            contractEntity.telemarketingTransactionId = telemarketingTransactionId;
            return this;
        }
        public ContractBuilder withDataTreatmentIndType(String dataTreatmentIndType) {
            contractEntity.dataTreatmentIndType = dataTreatmentIndType;
            return this;
        }
        public ContractBuilder withContractAcceptanceIndType(String contractAcceptanceIndType) {
            contractEntity.contractAcceptanceIndType = contractAcceptanceIndType;
            return this;
        }
        public ContractBuilder withContractNonCnclIndType(String contractNonCnclIndType) {
            contractEntity.contractNonCnclIndType = contractNonCnclIndType;
            return this;
        }
        public ContractBuilder withSaleChannelId(String saleChannelId) {
            contractEntity.saleChannelId = saleChannelId;
            return this;
        }
        public ContractBuilder withContractRenewalStatusType(String contractRenewalStatusType) {
            contractEntity.contractRenewalStatusType = contractRenewalStatusType;
            return this;
        }
        public ContractBuilder withContractRenewalSendingDate(String contractRenewalSendingDate) {
            contractEntity.contractRenewalSendingDate = contractRenewalSendingDate;
            return this;
        }
        public ContractBuilder withContractRenewalReceiptDate(String contractRenewalReceiptDate) {
            contractEntity.contractRenewalReceiptDate = contractRenewalReceiptDate;
            return this;
        }
        public ContractBuilder withInsrncCompanyRenwlPrpslId(String insrncCompanyRenwlPrpslId) {
            contractEntity.insrncCompanyRenwlPrpslId = insrncCompanyRenwlPrpslId;
            return this;
        }
        public ContractBuilder withInsrcCompanyRenwlRspseDesc(String insrcCompanyRenwlRspseDesc) {
            contractEntity.insrcCompanyRenwlRspseDesc = insrcCompanyRenwlRspseDesc;
            return this;
        }
        public ContractBuilder withNonRenewedCtrctReasontype(String nonRenewedCtrctReasontype) {
            contractEntity.nonRenewedCtrctReasontype = nonRenewedCtrctReasontype;
            return this;
        }
        public ContractBuilder withHonRenwCtrctSubReasonType(String nonRenwCtrctSubReasonType) {
            contractEntity.nonRenwCtrctSubReasonType = nonRenwCtrctSubReasonType;
            return this;
        }
        public ContractBuilder withOriginalPaymentSubChannelId(String originalPaymentSubChannelId) {
            contractEntity.originalPaymentSubChannelId = originalPaymentSubChannelId;
            return this;
        }
        public ContractBuilder withProcessedRegisterType(String processedRegisterType) {
            contractEntity.processedRegisterType = processedRegisterType;
            return this;
        }
        public ContractBuilder withTokenSupplierId(String tokenSupplierId) {
            contractEntity.tokenSupplierId = tokenSupplierId;
            return this;
        }
        public ContractBuilder withOpenpayCommerceTransDate(String openpayCommerceTransDate) {
            contractEntity.openpayCommerceTransDate = openpayCommerceTransDate;
            return this;
        }
        public ContractBuilder withPaymentMeansType(String paymentMeansType) {
            contractEntity.paymentMeansType = paymentMeansType;
            return this;
        }


        public ContractEntity build() {
            return contractEntity;
        }
    }

    @Override
    public String toString() {
        return "ContractEntity{" +
                "creationUserId='" + creationUserId + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                ", auditDate='" + auditDate + '\'' +
                ", insuranceContractEntityId='" + insuranceContractEntityId + '\'' +
                ", insuranceContractBranchId='" + insuranceContractBranchId + '\'' +
                ", contractFirstVerfnDigitId='" + contractFirstVerfnDigitId + '\'' +
                ", contractSecondVerfnDigitId='" + contractSecondVerfnDigitId + '\'' +
                ", insrcContractIntAccountId='" + insrcContractIntAccountId + '\'' +
                ", policyQuotaInternalId='" + policyQuotaInternalId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", insurancePolicyEndDate='" + insurancePolicyEndDate + '\'' +
                ", policyAnnulationDate='" + policyAnnulationDate + '\'' +
                ", policyFeeAmount='" + policyFeeAmount + '\'' +
                ", policyDiscountCouponId='" + policyDiscountCouponId + '\'' +
                ", endorsementPolicyIndType='" + endorsementPolicyIndType + '\'' +
                ", insuranceProductId='" + insuranceProductId + '\'' +
                ", insuranceModalityType='" + insuranceModalityType + '\'' +
                ", insuranceCompanyId='" + insuranceCompanyId + '\'' +
                ", insuranceManagerId='" + insuranceManagerId + '\'' +
                ", insurancePromoterId='" + insurancePromoterId + '\'' +
                ", contractManagerBranchId='" + contractManagerBranchId + '\'' +
                ", contractInceptionDate='" + contractInceptionDate + '\'' +
                ", insuranceContractStartDate='" + insuranceContractStartDate + '\'' +
                ", insuranceContractEndDate='" + insuranceContractEndDate + '\'' +
                ", insrncValidityMonthsNumber='" + insrncValidityMonthsNumber + '\'' +
                ", aftrReprgPendingInstNumber='" + aftrReprgPendingInstNumber + '\'' +
                ", contractRegisCstAgeNumber='" + contractRegisCstAgeNumber + '\'' +
                ", customerId='" + customerId + '\'' +
                ", domicileContractId='" + domicileContractId + '\'' +
                ", cardIssuingMarkType='" + cardIssuingMarkType + '\'' +
                ", issuedReceiptNumber='" + issuedReceiptNumber + '\'' +
                ", paymentFrequencyId='" + paymentFrequencyId + '\'' +
                ", premiumAmount='" + premiumAmount + '\'' +
                ", netPremPlcyOrigCurrAmount='" + netPremPlcyOrigCurrAmount + '\'' +
                ", settlePendingPremiumAmount='" + settlePendingPremiumAmount + '\'' +
                ", currencyId='" + currencyId + '\'' +
                ", lastInstallmentDate='" + lastInstallmentDate + '\'' +
                ", installmentPeriodFinalDate='" + installmentPeriodFinalDate + '\'' +
                ", insuredAmount='" + insuredAmount + '\'' +
                ", beneficiaryType='" + beneficiaryType + '\'' +
                ", renewalNumber='" + renewalNumber + '\'' +
                ", nextRenewalStartDate='" + nextRenewalStartDate + '\'' +
                ", ctrctDisputeStatusType='" + ctrctDisputeStatusType + '\'' +
                ", contractPreviousBranchId='" + contractPreviousBranchId + '\'' +
                ", periodNextPaymentDate='" + periodNextPaymentDate + '\'' +
                ", contPreviousSituationType='" + contPreviousSituationType + '\'' +
                ", insrncCoContractStatusType='" + insrncCoContractStatusType + '\'' +
                ", contractStatusId='" + contractStatusId + '\'' +
                ", insurPendingDebtIndType='" + insurPendingDebtIndType + '\'' +
                ", totalDebtAmount='" + totalDebtAmount + '\'' +
                ", prevPendBillRcptsNumber='" + prevPendBillRcptsNumber + '\'' +
                ", settlementVarPremiumAmount='" + settlementVarPremiumAmount + '\'' +
                ", settlementFixPremiumAmount='" + settlementFixPremiumAmount + '\'' +
                ", insuranceCompanyProductId='" + insuranceCompanyProductId + '\'' +
                ", automaticDebitIndicatorType='" + automaticDebitIndicatorType + '\'' +
                ", biometryTransactionId='" + biometryTransactionId + '\'' +
                ", telemarketingTransactionId='" + telemarketingTransactionId + '\'' +
                ", dataTreatmentIndType='" + dataTreatmentIndType + '\'' +
                ", contractAcceptanceIndType='" + contractAcceptanceIndType + '\'' +
                ", contractNonCnclIndType='" + contractNonCnclIndType + '\'' +
                ", saleChannelId='" + saleChannelId + '\'' +
                ", contractRenewalStatusType='" + contractRenewalStatusType + '\'' +
                ", contractRenewalSendingDate='" + contractRenewalSendingDate + '\'' +
                ", contractRenewalReceiptDate='" + contractRenewalReceiptDate + '\'' +
                ", insrncCompanyRenwlPrpslId='" + insrncCompanyRenwlPrpslId + '\'' +
                ", insrcCompanyRenwlRspseDesc='" + insrcCompanyRenwlRspseDesc + '\'' +
                ", nonRenewedCtrctReasontype='" + nonRenewedCtrctReasontype + '\'' +
                ", nonRenwCtrctSubReasonType='" + nonRenwCtrctSubReasonType + '\'' +
                ", originalPaymentSubChannelId='" + originalPaymentSubChannelId + '\'' +
                ", processedRegisterType='" + processedRegisterType + '\'' +
                ", tokenSupplierId='" + tokenSupplierId + '\'' +
                ", openpayCommerceTransDate='" + openpayCommerceTransDate + '\'' +
                ", paymentMeansType='" + paymentMeansType + '\'' +
                '}';
    }
}
