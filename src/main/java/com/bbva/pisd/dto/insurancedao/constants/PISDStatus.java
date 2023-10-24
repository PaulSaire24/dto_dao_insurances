package com.bbva.pisd.dto.insurancedao.constants;

public class PISDStatus {

    private PISDStatus() {
    }

    public enum RECEIPT_STATUS_TYPE{
        INC ("INC", "RECEIPT_STATUS_TYPE_INC"),
        FAC ("FAC", "RECEIPT_STATUS_TYPE_FAC"),
        COB ("COB", "RECEIPT_STATUS_TYPE_COB"),
        IMP ("IMP", "RECEIPT_STATUS_TYPE_IMP");

        private final String value;
        private final String description;

        RECEIPT_STATUS_TYPE(String value, String description) {
            this.value = value;
            this.description = description;
        }
        public String getValue() { return value; }

        public String getDescription() {
            return description;
        }
    }

    public enum RECEIPT_STATUS_TYPE_ENTITY_EXTERN{
        ENV ("ENV", "RECEIPT_STATUS_TYPE_ENTITY_EXTERN_ENV");

        private final String value;
        private final String description;

        RECEIPT_STATUS_TYPE_ENTITY_EXTERN(String value, String description) {
            this.value = value;
            this.description = description;
        }
        public String getValue() { return value; }

        public String getDescription() {
            return description;
        }
    }

    public enum CONTRACT_PAYMENT_MEANS_TYPE{
        //VALORES POR DEFINIR
        BNC ("BNC", "CONTRACT_PAYMENT_MEANS_TYPE_BNC"),
        EXT ("EXT", "CONTRACT_PAYMENT_MEANS_TYPE_EXT");

        private final String value;
        private final String description;

        CONTRACT_PAYMENT_MEANS_TYPE(String value, String description) {
            this.value = value;
            this.description = description;
        }

        public String getValue() { return value; }

        public String getDescription() {
            return description;
        }
    }

    public enum CONTRACT_STATUS_ID{
        ANU ("ANU", "CONTRACT_STATUS_ID_ANU"),
        BAJ ("BAJ", "CONTRACT_STATUS_ID_BAJ"),
        PEN ("PEN", " "),
        FOR ("FOR", " "),
        ;

        private final String value;
        private final String description;

        CONTRACT_STATUS_ID(String value, String description) {
            this.value = value;
            this.description = description;
        }
        public String getValue() { return value; }

        public String getDescription() {
            return description;
        }
    }

    public final class Incident{
        public static final String CONSTANT_OPERATION_STATUS_ID_REGISTRADO = "01";
        public static final String CONSTANT_OPERATION_STATUS_ID_CORREGIDO = "02";
        public static final String SEQUENCE_ID = "SEQUENCE";
    }

    public static final class ReProcess {
        private ReProcess() {
        }
        public static final String ERROR = "00";
        public static final String STARTED = "01";
        public static final String COMPLETED = "02";
        public static final String PARTIAL_COMPLETED = "03";

    }

    public final class ProcessedDetl{
        public static final String CONSTANT_REGISTRY_SITUATION_TYPE_FAILED = "00";
        public static final String CONSTANT_REGISTRY_SITUATION_TYPE_INICIADO = "01";
        public static final String CONSTANT_REGISTRY_SITUATION_TYPE_TERMINADO = "02";
    }
}
