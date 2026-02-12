package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;
import com.project.entity.TaskNew;

import java.util.List;

public interface TaskService {
    /**
     * 工单列表
     * @return
     */
    PageInfo<TaskList> taskList(TaskList params);
    /**
     * 工单详细
     * @return
     */
    List<TaskDet> taskDet(Long taskId);
    /**
     * 派单新增
     * @return
     */
    List<TaskNew> taskNew(String assIds);
}
