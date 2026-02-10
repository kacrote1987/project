package com.project.service;

import com.github.pagehelper.PageInfo;
import com.project.entity.EventList;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;

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
     * 告警列表
     * @return
     */
    PageInfo<EventList> warnList(EventList params);
}
