package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.ApiDet;
import com.project.entity.ApiList;
import com.project.mapper.ApiMapper;
import com.project.service.ApiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {
    @Resource
    ApiMapper apiMapper;

    @Override
    public PageInfo<ApiList> apiList(ApiList params) {
        PageHelper.startPage(params.getPage(), 10);
        List<ApiList> apiList = apiMapper.apiList(params);
        return PageInfo.of(apiList);
    }

    @Override
    public List<ApiDet> apiDet(Long apiId) {
        List<ApiDet> apiDet = null;
        if (apiId!=0) {
            apiDet = apiMapper.apiDet(apiId);
        }
        return apiDet;
    }

    @Override
    public void apiSave(ApiDet params) {
        if (params.getAction().equals("add")) {
            apiMapper.insertApi(params);
        } else if (params.getAction().equals("del")) {
            apiMapper.deleteApi(params.getApiId());
        } else {
            apiMapper.updateApi(params);
        }
    }
}
