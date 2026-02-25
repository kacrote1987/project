package com.project.controller;

import com.github.pagehelper.PageInfo;
import com.project.config.Result;
import com.project.entity.ApiDet;
import com.project.entity.ApiList;
import com.project.service.ApiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "三方平台")
@RestController
@RequestMapping("/api")
public class ApiController {
    @Resource
    ApiService apiService;

    @ApiOperation("平台列表")
    @PostMapping("/apiList")
    public Result apiList(ApiList params){
        PageInfo<ApiList> apiList= apiService.apiList(params);
        return Result.success(apiList);
    }

    @ApiOperation("平台详细")
    @PostMapping("/apiDet")
    public Result apiDet(@RequestBody Long apiId){
        List<ApiDet> apiDet=apiService.apiDet(apiId);
        return Result.success(apiDet);
    }

    @ApiOperation("平台保存")
    @PostMapping("/apiSave")
    public Result apiSave(@RequestBody ApiDet params){
        apiService.apiSave(params);
        return Result.success();
    }
}
