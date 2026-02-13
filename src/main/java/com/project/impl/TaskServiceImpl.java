package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.*;
import com.project.mapper.TaskMapper;
import com.project.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Resource
    TaskMapper taskMapper;

    @Override
    public PageInfo<TaskList> taskList(TaskList params) {
        PageHelper.startPage(params.getPage(), 10);
        List<TaskList> taskList = taskMapper.taskList(params);
        return PageInfo.of(taskList);
    }

    @Override
    public List<TaskDet> taskDet(Long taskId) {
        List<TaskDet> taskDetList = taskMapper.taskDet(taskId);
        String assIds = taskDetList.get(0).getAssIds();
        List<AssList> assList = taskMapper.taskAssList(assIds);
        taskDetList.get(0).setAssList(assList);
        List<EventList> eventList = taskMapper.eventList(assIds);
        taskDetList.get(0).setEventList(eventList);
        return taskDetList;
    }

    @Override
    public List<TaskNew> taskNew(String assIds) {
        List<TaskNew> taskNewList = new ArrayList<>();
        TaskNew taskNew = new TaskNew();
        Integer idSize = 1;
        Integer dataSize = 0;
        if(assIds!=null){
            assIds = assIds.replace(",","','");
            assIds = "'" + assIds + "'";
            List<AssList> assList = taskMapper.taskAssList(assIds);
            taskNew.setAssList(assList);
            dataSize = assList.size();
            List<EventList> eventList = taskMapper.eventList(assIds);
            taskNew.setEventList(eventList);
        }
        taskNewList.add(taskNew);
        while(assIds.indexOf(',')>0){
            idSize ++;
            assIds = assIds.substring(assIds.indexOf(',')+1);
        }
        if(idSize>dataSize){
            taskNewList.get(0).setCheckState(1);
        }
        return taskNewList;
    }
}
