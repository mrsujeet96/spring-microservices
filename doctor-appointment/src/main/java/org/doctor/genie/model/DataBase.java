package org.doctor.genie.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private DoctorHolder doctorHolder;
    private Map<Integer, Day> dayMap;

    public DataBase(){
        this.doctorHolder = new DoctorHolder();
        this.dayMap = new HashMap<Integer, Day>();
        this.dayMap.put(1, Day.MONDAY);
        this.dayMap.put(2, Day.TUESDAY);
        this.dayMap.put(4,Day.WEDNESDAY);
        this.dayMap.put(5,Day.THURSDAY);
        this.dayMap.put(6,Day.FRIDAY);
        this.dayMap.put(7,Day.SATURDAY);

    }

    public DoctorHolder getDoctorHolder(){
        return this.doctorHolder;
    }

    public Map<Integer, Day> getDayMap(){
        return Collections.unmodifiableMap(dayMap);
    }


}
