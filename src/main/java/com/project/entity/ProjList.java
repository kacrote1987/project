package com.project.entity;

public class ProjList {
    private Long rowNum;
    private Long projId;
    private String projTag;
    private String projType;
    private String deptName;
    private String projName;
    private String unitaName;
    private String unitaManager;
    private String unitbName;
    private String unitbManager;
    private String budgetAmount;
    private String budgetPercent;
    private String payPercent;
    private String projStepcode;
    private Integer page;
    private Integer limit;
    private Integer stepVal;

    public Long getRowNum() {
        return rowNum;
    }

    public void setRowNum(Long rowNum) {
        this.rowNum = rowNum;
    }

    public Long getProjId() {
        return projId;
    }

    public void setProjId(Long projId) {
        this.projId = projId;
    }

    public String getProjTag() {
        return projTag;
    }

    public void setProjTag(String projTag) {
        this.projTag = projTag;
    }

    public String getProjType() {
        return projType;
    }

    public void setProjType(String projType) {
        this.projType = projType;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getUnitaName() {
        return unitaName;
    }

    public void setUnitaName(String unitaName) {
        this.unitaName = unitaName;
    }

    public String getUnitaManager() {
        return unitaManager;
    }

    public void setUnitaManager(String unitaManager) {
        this.unitaManager = unitaManager;
    }

    public String getUnitbName() {
        return unitbName;
    }

    public void setUnitbName(String unitbName) {
        this.unitbName = unitbName;
    }

    public String getUnitbManager() {
        return unitbManager;
    }

    public void setUnitbManager(String unitbManager) {
        this.unitbManager = unitbManager;
    }

    public String getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(String budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public String getBudgetPercent() {
        return budgetPercent;
    }

    public void setBudgetPercent(String budgetPercent) {
        this.budgetPercent = budgetPercent;
    }

    public String getPayPercent() {
        return payPercent;
    }

    public void setPayPercent(String payPercent) {
        this.payPercent = payPercent;
    }

    public String getProjStepcode() {
        return projStepcode;
    }

    public void setProjStepcode(String projStepcode) {
        this.projStepcode = projStepcode;
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

    public Integer getStepVal() {
        return stepVal;
    }

    public void setStepVal(Integer stepVal) {
        this.stepVal = stepVal;
    }
}
