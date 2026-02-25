package com.project.mapper;

import com.project.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApiMapper {
    List<ApiList> apiList(@Param("params") ApiList params);
    List<ApiDet> apiDet(Long apiId);
    boolean insertApi(@Param("params") ApiDet params);
    boolean deleteApi(Long apiId);
    boolean updateApi(@Param("params") ApiDet params);
}
