package com.project.entity;

public class DocList {
    private Long docId;
    private Long typeId;
    private String docName;
    private String docContent;
    private String docPuber;
    private String docTime;
    private String docAnnex;
    private String docState;
    private Integer page;
    private Integer limit;

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocContent() {
        return docContent;
    }

    public void setDocContent(String docContent) {
        this.docContent = docContent;
    }

    public String getDocPuber() {
        return docPuber;
    }

    public void setDocPuber(String docPuber) {
        this.docPuber = docPuber;
    }

    public String getDocTime() {
        return docTime;
    }

    public void setDocTime(String docTime) {
        this.docTime = docTime;
    }

    public String getDocAnnex() {
        return docAnnex;
    }

    public void setDocAnnex(String docAnnex) {
        this.docAnnex = docAnnex;
    }

    public String getDocState() {
        return docState;
    }

    public void setDocState(String docState) {
        this.docState = docState;
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
