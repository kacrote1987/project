package com.project.mapper;

import com.project.entity.AssDet;
import com.project.entity.AssList;
import com.project.entity.EventList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssMapper {
    List<AssList> assList(@Param("params") AssList params);
    List<AssDet> selectDet(Long assId);
    boolean insertAss(@Param("params") AssDet params);
    boolean deleteAss(Long assId);
    boolean updateAss(@Param("params") AssDet params);
    List<AssList> assType(String type);
    boolean importAss(String htbh,String gcmc,String gys,String zzs,String jsdw,String zcflbm,String zcbqh,String zcmc,String ggxh
    ,String dw,String sl,String je,String kssyrq,String zcdd,String bq,String zt,String bz);
    List<EventList> eventList(Long assId,@Param("params") EventList params);
}
