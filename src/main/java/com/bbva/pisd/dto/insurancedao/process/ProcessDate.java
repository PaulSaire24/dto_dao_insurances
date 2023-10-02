package com.bbva.pisd.dto.insurancedao.process;

import java.io.Serializable;

public class ProcessDate implements Serializable {
    private String codproc;
    private String sitproce;
    private String feoper;
    private String feulpro;
    private String fepropro;
    private String enorigen;
    private String ceorigen;
    private String funcion;
    private String periodicidad;
    private Double tipoCambio;

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getCodproc() {
        return codproc;
    }

    public void setCodproc(String codproc) {
        this.codproc = codproc;
    }

    public String getSitproce() {
        return sitproce;
    }

    public void setSitproce(String sitproce) {
        this.sitproce = sitproce;
    }

    public String getFeoper() {
        return feoper;
    }

    public void setFeoper(String feoper) {
        this.feoper = feoper;
    }

    public String getFeulpro() {
        return feulpro;
    }

    public void setFeulpro(String feulpro) {
        this.feulpro = feulpro;
    }

    public String getFepropro() {
        return fepropro;
    }

    public void setFepropro(String fepropro) {
        this.fepropro = fepropro;
    }

    public String getEnorigen() {
        return enorigen;
    }

    public void setEnorigen(String enorigen) {
        this.enorigen = enorigen;
    }

    public String getCeorigen() {
        return ceorigen;
    }

    public void setCeorigen(String ceorigen) {
        this.ceorigen = ceorigen;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "ProcessDateDTO{" +
                "codproc='" + codproc + '\'' +
                ", sitproce='" + sitproce + '\'' +
                ", feoper='" + feoper + '\'' +
                ", feulpro='" + feulpro + '\'' +
                ", fepropro='" + fepropro + '\'' +
                ", enorigen='" + enorigen + '\'' +
                ", ceorigen='" + ceorigen + '\'' +
                ", funcion='" + funcion + '\'' +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }

    public static final class Builder {
        private ProcessDate processDate;

        private Builder() {
            processDate = new ProcessDate();
        }

        public static ProcessDate.Builder an() {
            return new ProcessDate.Builder();
        }

        public ProcessDate.Builder withFeoper(String feOper) {
            processDate.setFeoper(feOper);
            return this;
        }

        public ProcessDate build() {
            return processDate;
        }

    }
}
