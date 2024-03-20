package com.bbva.pisd.dto.insurancedao.query;

import com.bbva.pisd.dto.insurancedao.entities.ModalityEntity;
import com.bbva.pisd.dto.insurancedao.entities.QuotationModEntity;

public class QuotationModDTO {

    private QuotationModEntity quotationMod;
    private ModalityEntity modalityEntity;
    private String insuranceProductType;


    public QuotationModEntity getQuotationMod() {
        return quotationMod;
    }

    public void setQuotationMod(QuotationModEntity quotationMod) {
        this.quotationMod = quotationMod;
    }

    public ModalityEntity getModalityEntity() {
        return modalityEntity;
    }

    public void setModalityEntity(ModalityEntity modalityEntity) {
        this.modalityEntity = modalityEntity;
    }

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }
}
