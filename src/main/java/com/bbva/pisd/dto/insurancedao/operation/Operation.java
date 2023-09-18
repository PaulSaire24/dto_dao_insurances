package com.bbva.pisd.dto.insurancedao.operation;

import java.util.Arrays;
import java.util.Map;

public class Operation {
    private String table;
    private String query;
    private String nameProp;
    private Map<String, Object> params;
    private Map<String, Object>[] batchValues;
    private String typeOperation;
    private boolean isForListQuery;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getNameProp() {
        return nameProp;
    }

    public void setNameProp(String nameProp) {
        this.nameProp = nameProp;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public Map<String, Object>[] getBatchValues() {
        return batchValues;
    }

    public void setBatchValues(Map<String, Object>[] batchValues) {
        this.batchValues = batchValues;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public boolean isForListQuery() {
        return isForListQuery;
    }

    public void setForListQuery(boolean forListQuery) {
        isForListQuery = forListQuery;
    }

    @Override
    public String toString() {
        return "OperationDTO{" +
                "table='" + table + '\'' +
                ", query='" + query + '\'' +
                ", nameProp='" + nameProp + '\'' +
                ", params=" + params +
                ", batchValues=" + Arrays.toString(batchValues) +
                ", typeOperation='" + typeOperation + '\'' +
                ", isForListQuery=" + isForListQuery +
                '}';
    }

    public static final class Builder {
        private Operation operationDTO;

        private Builder() {
            operationDTO = new Operation();
        }

        public static Builder an() {
            return new Builder();
        }

        public Builder withTable(String table) {
            operationDTO.setTable(table);
            return this;
        }

        public Builder withQuery(String query) {
            operationDTO.setQuery(query);
            return this;
        }

        public Builder withNameProp(String nameProp) {
            operationDTO.setNameProp(nameProp);
            return this;
        }

        public Builder withParams(Map<String, Object> params) {
            operationDTO.setParams(params);
            return this;
        }
        public Builder withBatchValues(Map<String, Object>[] batchValues) {
            operationDTO.setBatchValues(batchValues);
            return this;
        }
        public Builder withTypeOperation(String typeOperation) {
            operationDTO.setTypeOperation(typeOperation);
            return this;
        }

        public Builder withIsForListQuery(boolean isForListQuery) {
            operationDTO.setForListQuery(isForListQuery);
            return this;
        }

        public Operation build() {
            return operationDTO;
        }
    }
}

