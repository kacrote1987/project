package com.project.mapper;

import com.project.entity.UnitDet;
import com.project.entity.UnitList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UnitMapper {
    List<UnitList> unitList(@Param("params") UnitList params, String unitType);
    List<UnitDet> unitDet(String unitId);
    boolean insertUnit(@Param("params") UnitDet params);
    boolean deleteUnit(Long unitId);
    boolean updateUnit(@Param("params") UnitDet params);
}
