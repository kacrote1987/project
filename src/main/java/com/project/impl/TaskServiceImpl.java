package com.project.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDetForm;
import com.project.entity.TaskListForm;
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
    public PageInfo<TaskListForm> taskList(TaskListForm params) {
        PageHelper.startPage(params.getPage(), 10);
        List<TaskListForm> taskList = taskMapper.taskList(params);
        return PageInfo.of(taskList);
    }

    @Override
    public List<TaskDetForm> taskDet(Long taskId) {
        List<TaskDetForm> taskDet = null;
        if (!taskId.equals(null)) {
            taskDet = taskMapper.taskDet(taskId);
        }
        return taskDet;
    }
}
