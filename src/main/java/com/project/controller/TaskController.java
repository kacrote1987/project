package com.project.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "工单管理")
@RestController
@RequestMapping("/task")
public class TaskController {
//    @Resource
//    DocService docService;

//    @ApiOperation("主页文件信息")
//    @PostMapping("/doclisthome")
//    public Result docListHome(DocListForm params){
//        List<DocListVo> docListHome= docService.docListHome(params);
//        return Result.success(docListHome);
//    }
}
