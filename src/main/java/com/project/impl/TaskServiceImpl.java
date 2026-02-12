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
        List<TaskDet> taskDet = null;
        if (taskId != null) {
            taskDet = taskMapper.taskDet(taskId);
        }
        return taskDet;
    }

    @Override
    public List<TaskNew> taskNew(String assIds) {
        List<TaskNew> taskNewList = new ArrayList<>();
        TaskNew taskNew = new TaskNew();
        if(assIds!=null){
            assIds = assIds.replace(",","','");
            assIds = "'" + assIds + "'";
            List<AssList> assList = taskMapper.taskAssList(assIds);
            taskNew.setAssList(assList);
            List<EventList> eventList = taskMapper.eventList(assIds);
            taskNew.setEventList(eventList);
        }
        taskNewList.add(taskNew);
        return taskNewList;
    }
}
