package com.project.mapper;

import com.project.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskMapper {
    List<TaskList> taskList(@Param("params") TaskList params);
    List<TaskDet> taskDet(Long taskId);
    List<AssList> taskAssList(String assIds);
    List<EventList> taskEventList(String assIds);
    boolean deleteTask(Long taskId);
    boolean updateTask(@Param("params") TaskDet params);
    boolean insertTask2(@Param("params") TaskNew2 params);
}
