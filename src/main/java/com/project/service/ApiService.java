package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.ApiDet;
import com.project.entity.ApiList;

import java.util.List;

public interface ApiService {
    /**
     * 平台列表
     * @return
     */
    PageInfo<ApiList> apiList(ApiList params);
    /**
     * 平台明细
     * @return
     */
    List<ApiDet> apiDet(Long apiId);
    /**
     * 平台增删改
     * @return
     */
    void apiSave(ApiDet params);
}
