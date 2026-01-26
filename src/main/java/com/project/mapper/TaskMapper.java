package com.project.mapper;

import com.project.entity.TaskDetForm;
import com.project.entity.TaskListForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskMapper {
    List<TaskListForm> taskList(@Param("params") TaskListForm params);
    List<TaskDetForm> taskDet(Long taskId);
}
