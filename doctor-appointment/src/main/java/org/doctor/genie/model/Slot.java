package org.doctor.genie.model;

public class Slot {
    private int id;

    private String startTime;
    private String endTime;

    public Slot(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;

    }

    public Slot() {
    }

    public int getId() {
        return id;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
