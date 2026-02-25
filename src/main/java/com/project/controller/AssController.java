package com.project.controller;

import com.github.pagehelper.PageInfo;
import com.project.config.Result;
import com.project.entity.AssDet;
import com.project.entity.AssList;
import com.project.entity.EventList;
import com.project.entity.TaskNew1;
import com.project.service.AssService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Api(description = "资产管理")
@RestController
@RequestMapping("/ass")
public class AssController {
    @Resource
    AssService assService;

    @ApiOperation("资产列表")
    @PostMapping("/assList")
    public Result assList(AssList params){
        PageInfo<AssList> assList= assService.assList(params);
        return Result.success(assList);
    }

    @ApiOperation("资产详细")
    @PostMapping("/assDet")
    public Result assDet(@RequestBody Long assId){
        List<AssDet> assDet=assService.assDet(assId);
        return Result.success(assDet);
    }

    @ApiOperation("资产保存")
    @PostMapping("/asssave")
    public Result assSave(@RequestBody AssDet params){
        assService.assSave(params);
        return Result.success();
    }

    @ApiOperation("资产类别")
    @PostMapping("/asstype")
    public Result assType(@RequestBody String type){
        List<AssList> assType=assService.assType(type);
        return Result.success(assType);
    }

    @ApiOperation("资产导入")
    @PostMapping("/assimp")
    public Result assImp(@RequestParam MultipartFile file) throws Exception {
        assService.assImp(file);
        return Result.success();
    }

    @ApiOperation("消息通知列表")
    @PostMapping("/eventList")
    public Result eventList(EventList params){
        PageInfo<EventList> eventList= assService.eventList(params);
        return Result.success(eventList);
    }

    @ApiOperation("告警设备")
    @PostMapping("/taskNew1")
    public Result taskNew(@RequestBody String assIds){
        List<TaskNew1> taskNew1= assService.taskNew1(assIds);
        return Result.success(taskNew1);
    }
}
