package com.project.controller;

import com.github.pagehelper.PageInfo;
import com.project.config.Result;
import com.project.entity.TaskDetForm;
import com.project.entity.TaskListForm;
import com.project.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "工单管理")
@RestController
@RequestMapping("/task")
public class TaskController {
    @Resource
    TaskService taskService;

    @ApiOperation("工单列表")
    @PostMapping("/taskList")
    public Result taskList(TaskListForm params){
        PageInfo<TaskListForm> taskList= taskService.taskList(params);
        return Result.success(taskList);
    }

    @ApiOperation("工单详细")
    @PostMapping("/taskDet")
    public Result taskDet(Long taskId){
        List<TaskDetForm> taskList= taskService.taskDet(taskId);
        return Result.success(taskList);
    }
}
