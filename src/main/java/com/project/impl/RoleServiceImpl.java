package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.RoleListDet;
import com.project.mapper.RoleMapper;
import com.project.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;

    @Override
    public PageInfo<RoleListDet> roleList(RoleListDet params) {
        Integer page = 0;
        if(params.getPage() != null){
            page = params.getPage();
        }
        PageHelper.startPage(page, 10);
        List<RoleListDet> roleList=roleMapper.roleList(params);
        return PageInfo.of(roleList);
    }

    @Override
    public List<RoleListDet> roleDet(Long roleId) {
        List<RoleListDet> roleDet=null;
        if(roleId!=0){
            roleDet=roleMapper.roleDet(roleId);
        }
        return roleDet;
    }

    @Override
    public void roleSave(RoleListDet params) {
        if (params.getAction().equals("add")) {
            roleMapper.insertRole(params);
        } else if (params.getAction().equals("del")) {
            roleMapper.deleteRole(params.getRoleId());
            //还需增加清空用户下面改角色的，即更新用户表
        } else {
            roleMapper.updateRole(params);
        }
    }

    public static String method (String str){
        String pos1;
        String pos2=null;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i); //把字符串转为字符
            if(c >= 'A' && c <= 'Z'){
                pos1=str.replace(c,(char)(c+32));
                pos2=pos1.substring(0,i)+'_'+pos1.substring(i,pos1.length());
            }
        }
        return pos2;
    }
}
