package com.project.mapper;

import com.project.entity.RoleListDet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<RoleListDet> roleList(@Param("params") RoleListDet params);
    List<RoleListDet> roleDet(Long roleId);
    boolean insertRole(@Param("params") RoleListDet params);
    boolean deleteRole(Long roleId);
    boolean updateRole(@Param("params") RoleListDet params);
}
