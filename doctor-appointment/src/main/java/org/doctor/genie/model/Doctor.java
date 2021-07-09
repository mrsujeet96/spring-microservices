package org.doctor.genie.model;

import java.util.List;
import java.util.Map;

public class Doctor {

    private String id;
    private String name;
    private double experience;
    private List<String> specializations;

    private Map<Day, List<Slot>> slots;

    //Doctor Fees in Rupess.
    private double fees;

    public Doctor(String id, String name, double experience, List<String> specialities, double fees, Map<Day, List<Slot>> slots) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.specializations = specialities;
        this.fees = fees;
        this.slots = slots;
    }

    public Doctor() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    public double getFees() {
        return fees;
    }

    public Map<Day, List<Slot>> getSlots() {
        return slots;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                ", specializations=" + specializations +
                ", slots=" + slots +
                ", fees=" + fees +
                '}';
    }
}
