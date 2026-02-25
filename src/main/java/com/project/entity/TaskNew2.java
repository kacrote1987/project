package com.project.entity;

import java.util.List;

public class TaskNew2 {
    List<AssList> assList;
    List<EventList> eventList;
    Integer checkState;

    public List<AssList> getAssList() {
        return assList;
    }

    public void setAssList(List<AssList> assList) {
        this.assList = assList;
    }

    public List<EventList> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventList> eventList) {
        this.eventList = eventList;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }
}
