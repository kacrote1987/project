package com.project.mapper;

import com.project.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProjMapper {
    List<ProjList> selProjList(@Param("params") ProjList params);
    List<ProjDet> selProjDet(String projId);
    boolean insertProj(@Param("params") ProjDet params);
    boolean deleteProj(Long projId);
    boolean updateProj(@Param("params") ProjDet params);
    boolean projStep(Long projId,Integer stepVal);
    boolean updateProjunit(Long projId,String type,Long unitId);
    String getAssTbl(Long projId);
    List<AssProj> assProj(Long projId);
    List<ProjCostForm> projCost(Long projId);
    List<MeetListForm> meetList(Long projId);
    List<GanttDetForm> selGanttDet(Long projId);
    boolean insertGantt(Long projId);
    boolean deleteGantt(Long ganttId);
    boolean updateGantt(Long ganttId,String field,String value);
    List<GanttDispForm> selGanttDisp(Long projId);
    List<DocListVo> docList(Long projId,@Param("params") DocList params);
    List<DocDet> docDet(Long docId);
}
