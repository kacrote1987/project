package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.UnitDet;
import com.project.entity.UnitList;
import com.project.mapper.UnitMapper;
import com.project.service.UnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {
    @Resource
    UnitMapper unitMapper;

    @Override
    public PageInfo<UnitList> unitList(UnitList params, String type) {
        PageHelper.startPage(params.getPage(), 10);
        type=type.substring(0,type.indexOf("="));
        String unitType;
        if(type.equals("ywdw")){
            unitType="业务单位";
        } else if(type.equals("jldw")){
            unitType="监理单位";
        } else if(type.equals("sgdw")){
            unitType="施工单位";
        } else {
            unitType=params.getUnitType();
        }
        List<UnitList> unitList=unitMapper.unitList(params,unitType);
        return PageInfo.of(unitList);
    }

    @Override
    public List<UnitDet> unitDet(String unitId) {
        List<UnitDet> unitDet=unitMapper.unitDet(unitId);
        return unitDet;
    }

    @Override
    public void unitSave(UnitDet params) {
        if(params.getAction().equals("add")){
            unitMapper.insertUnit(params);
        }else if(params.getAction().equals("del")){
            unitMapper.deleteUnit(params.getUnitId());
        }else{
            unitMapper.updateUnit(params);
        }
    }

    @Override
    public List<UnitList> toWord(String url) {
        return null;
    }
}
