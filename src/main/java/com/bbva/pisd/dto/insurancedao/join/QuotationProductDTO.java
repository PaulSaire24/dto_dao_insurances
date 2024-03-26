package com.bbva.pisd.dto.insurancedao.join;

import com.bbva.pisd.dto.insurancedao.entities.InsuranceBusinessEntity;
import com.bbva.pisd.dto.insurancedao.entities.InsuranceProductEntity;
import com.bbva.pisd.dto.insurancedao.entities.QuotationEntity;
import com.bbva.pisd.dto.insurancedao.entities.QuotationModEntity;

public class QuotationProductDTO {
    private QuotationEntity quotation;
    private QuotationModEntity quotationMod;
    private InsuranceProductEntity insuranceProduct;
    private InsuranceBusinessEntity insuranceBusiness;

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

    public InsuranceProductEntity getInsuranceProduct() {
        return insuranceProduct;
    }

    public void setInsuranceProduct(InsuranceProductEntity insuranceProduct) {
        this.insuranceProduct = insuranceProduct;
    }

    public InsuranceBusinessEntity getInsuranceBusiness() {
        return insuranceBusiness;
    }

    public void setInsuranceBusiness(InsuranceBusinessEntity insuranceBusiness) {
        this.insuranceBusiness = insuranceBusiness;
    }
}
