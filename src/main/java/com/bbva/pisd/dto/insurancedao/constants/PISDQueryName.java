package com.bbva.pisd.dto.insurancedao.constants;

public enum PISDQueryName {

    SQL_INSERT_INSURANCE_INCIDENT("INSERT INTO PISD.T_PISD_INSURANCE_INCIDENT " +
                                          "( INCIDENT_SEQL_NUMBER, INSURANCE_CONTRACT_ENTITY_ID, INSURANCE_CONTRACT_BRANCH_ID, " +
                                          "INSRC_CONTRACT_INT_ACCOUNT_ID, OPERATION_DATE, INCIDENCE_ERROR_ID, INCIDENCE_ERROR_DESC, " +
                                          "POLICY_RECEIPT_ID, REAL_OPERATION_AMOUNT, AUTH_ORIGIN_CURNCY_ID, OPERATION_ADDITIONAL_AMOUNT, " +
                                          "DEBIT_ACCOUNT_ID,GL_ACCOUNT_DATE, CHANNEL_TYPE_ID, OPERATION_STATUS_ID, " +
                                          "CREATION_TRANSACTION_ID, CREATION_USER_ID, CREATION_DATE, USER_AUDIT_ID, " +
                                          "AUDIT_DATE ) VALUES  (PISD.Q_PISD_INCIDENT_ID0.NEXTVAL, " +
                                          ":INSURANCE_CONTRACT_ENTITY_ID, :INSURANCE_CONTRACT_BRANCH_ID, :INSRC_CONTRACT_INT_ACCOUNT_ID, " +
                                          "to_date( nvl(:OPERATION_DATE, sysdate), 'YYYY-MM-DD'), :INCIDENCE_ERROR_ID, " +
                                          ":INCIDENCE_ERROR_DESC, :POLICY_RECEIPT_ID, :REAL_OPERATION_AMOUNT, " +
                                          ":AUTH_ORIGIN_CURNCY_ID, :OPERATION_ADDITIONAL_AMOUNT, :DEBIT_ACCOUNT_ID, " +
                                          ":GL_ACCOUNT_DATE, :CHANNEL_TYPE_ID, :OPERATION_STATUS_ID, " +
                                          ":CREATION_TRANSACTION_ID, :CREATION_USER_ID, " +
                                          "SYSTIMESTAMP, :USER_AUDIT_ID, SYSTIMESTAMP )");
    private final String value;

    PISDQueryName(String value) { this.value = value; }

    public String getValue() { return value; }
}
