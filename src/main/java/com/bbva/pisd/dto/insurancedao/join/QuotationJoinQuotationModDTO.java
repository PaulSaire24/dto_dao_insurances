package com.bbva.pisd.dto.insurancedao.join;

import com.bbva.pisd.dto.insurancedao.entities.ModalityEntity;
import com.bbva.pisd.dto.insurancedao.entities.QuotationEntity;
import com.bbva.pisd.dto.insurancedao.entities.QuotationModEntity;

public class QuotationJoinQuotationModDTO {

    private QuotationEntity quotation;
    private QuotationModEntity quotationMod;
    private String insuranceProductType;
    private ModalityEntity modality;


    public QuotationEntity getQuotation() {
        return quotation;
    }

    public void setQuotation(QuotationEntity quotation) {
        this.quotation = quotation;
    }

    public QuotationModEntity getQuotationMod() {
        return quotationMod;
    }

    public void setQuotationMod(QuotationModEntity quotationMod) {
        this.quotationMod = quotationMod;
    }

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }

    public ModalityEntity getModality() {
        return modality;
    }

    public void setModality(ModalityEntity modality) {
        this.modality = modality;
    }
}
