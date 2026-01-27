package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;
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
        List<TaskDet> taskDet = null;
        if (!taskId.equals(null)) {
            taskDet = taskMapper.taskDet(taskId);
        }
        return taskDet;
    }
}
