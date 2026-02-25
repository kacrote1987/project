package com.project.entity;

public class ApiList {
    private Long rowNum;
    private Long apiId;
    private String apiName;
    private String apiManufacture;
    private String apiNet;
    private String apiIpv4;
    private String accessKey;
    private String secretKey;
    private String apiRemark;
    private String apiState;
    private Integer page;
    private Integer limit;

    public Long getRowNum() {
        return rowNum;
    }

    public void setRowNum(Long rowNum) {
        this.rowNum = rowNum;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiManufacture() {
        return apiManufacture;
    }

    public void setApiManufacture(String apiManufacture) {
        this.apiManufacture = apiManufacture;
    }

    public String getApiNet() {
        return apiNet;
    }

    public void setApiNet(String apiNet) {
        this.apiNet = apiNet;
    }

    public String getApiIpv4() {
        return apiIpv4;
    }

    public void setApiIpv4(String apiIpv4) {
        this.apiIpv4 = apiIpv4;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    public String getApiState() {
        return apiState;
    }

    public void setApiState(String apiState) {
        this.apiState = apiState;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
