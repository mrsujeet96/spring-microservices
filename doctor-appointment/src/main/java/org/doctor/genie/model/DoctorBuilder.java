package org.doctor.genie.model;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DoctorBuilder {
    private String name;
    private double experience;
    private List<String> specialities;
    private double fees;
    private Map<Day, List<Slot>> slots;

    public DoctorBuilder() {
    }

    public DoctorBuilder(String name, double experience, List<String> specialities, double fees, Map<Day, List<Slot>> slots) {
        this.name = name;
        this.experience = experience;
        this.specialities = specialities;
        this.fees = fees;
        this.slots = slots;
    }

    public DoctorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public DoctorBuilder setExperience(double experience) {
        this.experience = experience;
        return this;
    }

    public DoctorBuilder setSpecialities(List<String> specialities) {
        this.specialities = specialities;
        return this;
    }

    public DoctorBuilder setFees(double fees) {
        this.fees = fees;
        return this;
    }

    public DoctorBuilder setSlots(Map<Day, List<Slot>> slots){
        this.slots = slots;
        return this;
    }

    public Doctor build() {
        final String doctorID = UUID.randomUUID().toString();
        return new Doctor(doctorID, name, experience, specialities, fees, slots);
    }
}