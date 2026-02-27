package com.project.controller;

import com.github.pagehelper.PageInfo;
import com.project.config.Result;
import com.project.entity.TaskDet;
import com.project.entity.TaskList;
import com.project.entity.TaskNew1;
import com.project.entity.TaskNew2;
import com.project.service.TaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Result taskList(TaskList params){
        PageInfo<TaskList> taskList= taskService.taskList(params);
        return Result.success(taskList);
    }

    @ApiOperation("工单详细")
    @PostMapping("/taskDet")
    public Result taskDet(@RequestBody String params){
        List<TaskDet> taskDet= taskService.taskDet(params);
        return Result.success(taskDet);
    }

    @ApiOperation("工单保存")
    @PostMapping("/taskSave")
    public Result taskSave(@RequestBody TaskDet params){
        taskService.taskSave(params);
        return Result.success();
    }

    @ApiOperation("工单新增1")
    @PostMapping("/taskNew1")
    public Result taskNew1(@RequestBody TaskNew1 params){
        taskService.taskNew1(params);
        return Result.success();
    }

    @ApiOperation("工单新增2")
    @PostMapping("/taskNew2")
    public Result taskNew2(@RequestBody TaskNew2 params){
        taskService.taskNew2(params);
        return Result.success();
    }
}
