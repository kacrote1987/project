package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.*;
import com.project.mapper.TaskMapper;
import com.project.service.TaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<TaskDet> taskDet(String params) {
        Long taskId=Long.valueOf(params.substring(0,params.indexOf("&")));
        Long typeId=Long.valueOf(params.substring(params.indexOf("&")+1,params.length()));
        List<TaskDet> taskDetList = taskMapper.taskDet(taskId);
        String assIds = taskDetList.get(0).getAssIds();
        if(typeId!=3 && assIds!=null && !assIds.equals("")){
            List<AssList> assList = taskMapper.taskAssList(assIds);
            taskDetList.get(0).setAssList(assList);
            List<EventList> eventList = taskMapper.taskEventList(assIds);
            taskDetList.get(0).setEventList(eventList);
        }
        return taskDetList;
    }

    @Override
    public void taskSave(TaskDet params) {
        if(params.getAction().equals("del")){
            taskMapper.deleteTask(params.getTaskId());
        }else{
            taskMapper.updateTask(params);
        }
    }

    @Override
    public void taskNew1(TaskNew1 params) {

    }

    @Override
    public void taskNew2(TaskNew2 params) {
        taskMapper.insertTask2(params);
    }
}
