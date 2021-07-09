package org.doctor.genie.service;

import java.util.HashMap;
import java.util.Map;

public class MenuProcessorFactory {

    private Map<Integer, MenuProcessor> menuProcessors ;

    public MenuProcessorFactory(){
        this.menuProcessors = new HashMap<Integer, MenuProcessor>();
        this.menuProcessors.put(1, new AddDoctorMenuProcessor());
        this.menuProcessors.put(2, new ListDoctorsMenuProcessor());
        this.menuProcessors.put(3,  new SelectDoctorMenuProcessor());

    }

    public MenuProcessor fetchMenuProcessor(int menuOption){
        return this.menuProcessors.get(menuOption);
    }
}
