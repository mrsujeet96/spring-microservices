package org.doctor.genie.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorHolder {

    private Map<String, Doctor> doctors;

    public DoctorHolder(){
        this.doctors = new HashMap<String, Doctor>();
    }



    public boolean addDoctor(String name, double experience, List<String> specialities, double fees, Map<Day, List<Slot>> slots){
        final Doctor doctor = new DoctorBuilder().setName(name).setSpecialities(specialities).setExperience(experience)
                .setFees(fees).setSlots(slots).build();
        System.out.println(doctor);
        doctors.put(doctor.getId(), doctor);
        return true;
    }




    public Collection<Doctor> listAllDoctors(){
        return doctors.values();
    }
}
