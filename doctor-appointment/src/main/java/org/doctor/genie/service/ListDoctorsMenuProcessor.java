package org.doctor.genie.service;

import org.doctor.genie.model.DataBase;
import org.doctor.genie.model.Doctor;

import java.util.Collection;
import java.util.Scanner;

public class ListDoctorsMenuProcessor implements MenuProcessor{

    public void process(DataBase dataBase, Scanner sc) {
        final Collection<Doctor> doctors = dataBase.getDoctorHolder().listAllDoctors();

        System.out.println("**************** ALL DOCTORS **********************");
        for(Doctor doctor : doctors){
            System.out.println(doctor);
        }
    }
}
