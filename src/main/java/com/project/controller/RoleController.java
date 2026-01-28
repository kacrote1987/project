package com.project.controller;

import com.github.pagehelper.PageInfo;
import com.project.config.Result;
import com.project.entity.RoleListDet;
import com.project.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    RoleService roleService;

    @ApiOperation("角色列表")
    @PostMapping("/roleList")
    public Result roleList(RoleListDet params){
        PageInfo<RoleListDet> roleList= roleService.roleList(params);
        return Result.success(roleList);
    }

    @ApiOperation("角色详细")
    @PostMapping("/roleDet")
    public Result roleDet(@RequestBody Long roleId){
        List<RoleListDet> roleDet=roleService.roleDet(roleId);
        return Result.success(roleDet);
    }

    @ApiOperation("角色保存")
    @PostMapping("/roleSave")
    public Result roleSave(@RequestBody RoleListDet params){
        roleService.roleSave(params);
        return Result.success();
    }

//    @ApiOperation("菜单权限")
//    @PostMapping("/password")
//    public Result password(@RequestBody LoginForm params){
//        roleService.password(params);
//        return Result.success();
//    }
//
//    @ApiOperation("数据权限")
//    @PostMapping("/password")
//    public Result password(@RequestBody LoginForm params){
//        roleService.password(params);
//        return Result.success();
//    }
//
//    @ApiOperation("操作权限")
//    @PostMapping("/password")
//    public Result password(@RequestBody LoginForm params){
//        roleService.password(params);
//        return Result.success();
//    }
}
