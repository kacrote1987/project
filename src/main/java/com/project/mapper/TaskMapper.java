package com.project.mapper;

import com.project.entity.TaskDet;
import com.project.entity.TaskList;
import com.project.entity.TaskNew2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskMapper {
    List<TaskList> taskList(@Param("params") TaskList params);
    List<TaskDet> taskDet(Long taskId);
    boolean insertTask2(@Param("params") TaskNew2 params);
}
