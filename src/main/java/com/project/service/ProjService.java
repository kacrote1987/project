package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.*;

import java.util.List;

public interface ProjService {
    /**
     * 项目列表
     * @return
     */
    PageInfo<ProjList> projList(ProjList params);
    /**
     * 项目详细
     * @return
     */
    List<ProjDet> projDet(String projId);
    /**
     * 项目保存
     * @return
     */
    void projSave(ProjDet params);
    /**
     * 项目流转
     * @return
     */
    void projStep(ProjList params);
    /**
     * 项目资产
     * @return
     */
    List<AssProj> assProj(String params);
    /**
     * 成本管理
     * @return
     */
    List<ProjCostForm> projCost(String params);
    /**
     * 例会列表
     * @return
     */
    List<MeetListForm> meetList(Long projId);
    /**
     * 例会详细
     * @return
     */
    List<MeetDetForm> meetDet(String projId);
    /**
     * 例会保存
     * @return
     */
    void meetSave(MeetDetForm params);
    /**
     * 甘特图详细
     * @return
     */
    List<GanttDetForm> ganttDet(String params);
    /**
     * 甘特图操作
     * @return
     */
    void ganttDo(GanttDetForm params);
    /**
     * 甘特图展示
     * @return
     */
    List<GanttDispForm> ganttDisp(Long projId);
    /**
     * 甘特图展示
     * @return
     */
    void ganttLog(Long projId);
    /**
     * 文件信息列表
     * @return
     */
    PageInfo<DocListVo> docList(Long projId, DocList params);
    /**
     * 文件信息详细
     * @return
     */
    List<DocDet> docDet(Long docId);
}
