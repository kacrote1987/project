package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.*;

import java.util.List;

public interface UserService {
    LoginVo login(LoginForm params);
    PageInfo<UserList> userList(UserList params);
    List<UserDet> userDet(Long userId);
    void userAdd(UserDet params);
    void userDel(Long userId);
    void userEdit(UserDet params);
    void password(LoginForm params);
}
