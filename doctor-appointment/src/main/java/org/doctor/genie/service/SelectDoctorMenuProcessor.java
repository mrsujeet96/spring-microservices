package org.doctor.genie.service;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.doctor.genie.model.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SelectDoctorMenuProcessor implements MenuProcessor {


    @Override
    public void process(DataBase dataBase, Scanner sc) {
        final Collection<Doctor> doctors = dataBase.getDoctorHolder().listAllDoctors();
        System.out.println("****************It came in 3 option **********************");

        System.out.println("**************** ALL DOCTORS **********************");

        Map<Number, String> doctorName = new HashMap<>();
        int i = 0;
        for (Doctor doctor : doctors) {
            i++;
            System.out.println(i + "." + doctor.getName());
            doctorName.put(i, doctor.getName());
        }

        System.out.println("Enter the Number doctor to choose the doctor : ");

        final int optionSelected = sc.nextInt();
        final String selectedDoctor = doctorName.get(optionSelected);
        System.out.println("your selected the doctor is: "+selectedDoctor);



    }


}

