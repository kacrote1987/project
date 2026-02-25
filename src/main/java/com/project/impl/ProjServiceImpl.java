package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.GanttDetForm;
import com.project.entity.ProjDet;
import com.project.entity.ProjList;
import com.project.entity.*;
import com.project.mapper.ProjMapper;
import com.project.service.ProjService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjServiceImpl implements ProjService {
    @Resource
    ProjMapper projMapper;

    @Override
    public PageInfo<ProjList> projList(ProjList params) {
        PageHelper.startPage(params.getPage(), 10);
        List<ProjList> projList=projMapper.selProjList(params);
        return PageInfo.of(projList);
    }

    @Override
    public List<ProjDet> projDet(String projId) {
        List<ProjDet> projDet=projMapper.selProjDet(projId);
        return projDet;
    }

    @Override
    public void projSave(ProjDet params) {
        if(params.getAction().equals("add")){
            projMapper.insertProj(params);
        }else if(params.getAction().equals("del")){
            projMapper.deleteProj(params.getProjId());
        }else{
            projMapper.updateProj(params);
        }
    }

    @Override
    public void projStep(ProjList params) {
        projMapper.projStep(params.getProjId(),params.getStepVal());
    }

    @Override
    public List<AssProj> assProj(String params) {
        Long projId=Long.valueOf(params.substring(0,params.indexOf("=")));
        String tbl=projMapper.getAssTbl(projId);
        List<AssProj> assProj=null;
        if(tbl.equals("t_ass_camera")){
            assProj = projMapper.assProj(projId);
        }
        return assProj;
    }

    @Override
    public List<ProjCostForm> projCost(String params) {
        Long projId=Long.valueOf(params.substring(0,params.indexOf("=")));
        String tbl=projMapper.getAssTbl(projId);
        List<ProjCostForm> projCost=null;
        if(tbl.equals("t_ass_camera")){
            projCost = projMapper.projCost(projId);
        }
        return projCost;
    }

    @Override
    public List<MeetListForm> meetList(Long projId) {
        List<MeetListForm> meetList=projMapper.meetList(projId);
        return meetList;
    }

    @Override
    public List<MeetDetForm> meetDet(String projId) {
        return null;
    }

    @Override
    public void meetSave(MeetDetForm params) {

    }

    @Override
    public List<GanttDetForm> ganttDet(String params) {
        Long projId=Long.valueOf(params.substring(0,params.indexOf("=")));
        List<GanttDetForm> ganttdet=projMapper.selGanttDet(projId);
        return ganttdet;
    }

    @Override
    public void ganttDo(GanttDetForm params) {
        if(params.getValue()!="" && params.getValue()!=""){
            System.out.println("不为空");
        }else{
            System.out.println("为空");
        }
        if(params.getAction().equals("add")){
            projMapper.insertGantt(params.getProjId());
        }else if(params.getAction().equals("del")){
            projMapper.deleteGantt(params.getGanttId());
        }else{
            projMapper.updateGantt(params.getGanttId(),method(params.getField()),params.getValue());
        }
    }

    @Override
    public List<GanttDispForm> ganttDisp(Long projId) {
        List<GanttDispForm> ganttdisp=projMapper.selGanttDisp(projId);
        return ganttdisp;
    }

    @Override
    public void ganttLog(Long projId) {

    }

    @Override
    public PageInfo<DocListVo> docList(Long projId, DocList params) {
        PageHelper.startPage(params.getPage(), 10);
        List<DocListVo> docList=projMapper.docList(projId,params);
        return PageInfo.of(docList);
    }

    @Override
    public List<DocDet> docDet(Long docId) {
        List<DocDet> docDet=projMapper.docDet(docId);
        return docDet;
    }

    public static String method (String str){
        String pos="";
        if(str!=null && str!=""){
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i); //把字符串转为字符
                if(c >= 'A' && c <= 'Z'){
                    pos=pos+'_'+(char)(c+32);
                }
                else{
                    pos=pos+c;
                }
            }
        }else{
            pos="";
        }
        return pos;
    }
}
