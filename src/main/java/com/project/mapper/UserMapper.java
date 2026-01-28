package com.project.mapper;

import com.project.entity.LoginVo;
import com.project.entity.UserDet;
import com.project.entity.UserList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    LoginVo login(String userCode, String userPwd);
    List<UserList> userList(@Param("params") UserList params);
    List<UserDet> userDet(Long userId);
    boolean insertUser(@Param("params") UserDet params);
    boolean deleteUser(Long userId);
    boolean userEdit(@Param("params") UserDet params);
    boolean changePassword(String password,Long userId);
}
