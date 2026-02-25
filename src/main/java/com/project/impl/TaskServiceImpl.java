package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;
import com.project.entity.TaskNew1;
import com.project.entity.TaskNew2;
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
    public List<TaskDet> taskDet(Long taskId) {
//        List<TaskDet> taskDetList = taskMapper.taskDet(taskId);
//        String assIds = taskDetList.get(0).getAssIds();
//        List<AssList> assList = taskMapper.taskAssList(assIds);
//        taskDetList.get(0).setAssList(assList);
//        List<EventList> eventList = taskMapper.eventList(assIds);
//        taskDetList.get(0).setEventList(eventList);
        return null;
    }

    @Override
    public void taskNew1(TaskNew1 params) {

    }

    @Override
    public void taskNew2(TaskNew2 params) {
        taskMapper.insertTask2(params);
    }
}
