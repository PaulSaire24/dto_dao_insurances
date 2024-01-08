package com.bbva.pisd.dto.insurancedao.constants;

public enum PISDInsuranceErrors {
    QUERY_EMPTY_RESULT("PISD00120000", false, "No se encontraron resultados en la base de datos oracle ."),
    ERROR_DUPLICATE_KEY("PISD00120052", false, "Se está intentando ingresar un registro con la misma clave primaria ."),
    ERROR_INCORRECT_RESULT("PISD00120050", false, "La consulta ha recuperado más datos de los esperados ."),
    ERROR_TIME_OUT("PISD00120051", false, "Ocurrió un error de tiempo de espera en la conexión a la base de datos Oracle."),
    PARAMETERS_INVALIDATE("PISD00120052", false, "Parámetros inválidos al realizar la operación en la base de datos.");

    private final String adviceCode;
    private final boolean rollback;
    private final String message;

     PISDInsuranceErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }

    public String getAdviceCode() {
        return this.adviceCode;
    }

    public boolean isRollback() {
        return this.rollback;
    }

    public String getMessage() {
        return this.message;
    }
}
