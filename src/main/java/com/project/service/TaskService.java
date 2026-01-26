package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDetForm;
import com.project.entity.TaskListForm;

import java.util.List;

public interface TaskService {
    /**
     * 工单列表
     * @return
     */
    PageInfo<TaskListForm> taskList(TaskListForm params);
    /**
     * 工单详细
     * @return
     */
    List<TaskDetForm> taskDet(Long taskId);
}
