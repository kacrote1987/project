package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;
import com.project.entity.TaskNew1;
import com.project.entity.TaskNew2;

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
     * 工单新增1
     * @return
     */
    void taskNew1(TaskNew1 params);
    /**
     * 工单新增2
     * @return
     */
    void taskNew2(TaskNew2 params);
}
