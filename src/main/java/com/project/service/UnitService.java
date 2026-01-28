package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.UnitDet;
import com.project.entity.UnitList;

import java.util.List;

public interface UnitService {
    /**
     * 单位列表
     * @return
     */
    PageInfo<UnitList> unitList(UnitList params, String type);
    /**
     * 单位详细
     * @return
     */
    List<UnitDet> unitDet(String unitId);
    /**
     * 单位保存
     * @return
     */
    void unitSave(UnitDet params);
    /**
     * 导出word
     * @return
     */
    List<UnitList> toWord(String url);
}
