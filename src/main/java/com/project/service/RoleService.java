package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.RoleListDet;

import java.util.List;

public interface RoleService {
    PageInfo<RoleListDet> roleList(RoleListDet params);
    List<RoleListDet> roleDet(Long roleId);
    void roleSave(RoleListDet params);
//    void userEdit(UserDetForm params);
//    void password(LoginForm params);
}
