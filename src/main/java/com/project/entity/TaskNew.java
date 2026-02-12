package com.project.entity;

import java.util.List;

public class TaskNew {
    List<AssList> assList;
    List<EventList> eventList;

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
}
