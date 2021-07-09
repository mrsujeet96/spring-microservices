package org.doctor.genie.service;

//import jdk.jfr.Timespan;
import org.doctor.genie.model.DataBase;
import org.doctor.genie.model.Day;
import org.doctor.genie.model.DoctorHolder;
import org.doctor.genie.model.Slot;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddDoctorMenuProcessor implements MenuProcessor{



    public void process(DataBase dataBase, Scanner sc) {
        final DoctorHolder doctorHolder = dataBase.getDoctorHolder();
        System.out.println("\n\n ************************** \n\n");
        System.out.println("ADD DOCTOR INFORMATION \n");

        System.out.print("\nSpecify doctor name :\n");
        final String doctorName = sc.next() + sc.nextLine();
        System.out.println(doctorName);

        System.out.print("\nSpecifiy "+ doctorName +  "'s experience in years :");
        final double experience = sc.nextDouble();

        System.out.print("\nAdd " + doctorName + "'s number of specializations :");
        final int noOfSpecializations = sc.nextInt();

        List<String> specializations = new ArrayList<String>();
        for(int i = 0 ; i< noOfSpecializations ; i++){
            System.out.print("\nAdd Specialization " + (i+1) + " :" );
            specializations.add(sc.next() + sc.nextLine());
        }

        System.out.print("\n\nSpecifiy "+ doctorName +  "'s fees in Rupees :");
        final double fees = sc.nextDouble();

        System.out.print("\n\nWe would be adding slots for " + doctorName + " : \n" );

        System.out.println("\nSelect 1 for MONDAY\nSelect 2 for Tuesday\nSelect 3 for Wednesday\nSelect 4 for Thursday\nSelect 5 for Friday\n Select 6 for Saturday\nSelect 7 for Sunday");
        final int daySelected = sc.nextInt();

        Map<Day, List<Slot>> slotMap = new HashMap<Day, List<Slot>>();
        Map<Integer, Day> dayMap = dataBase.getDayMap();

        final Day day = dayMap.get(daySelected);
        long slotWidth = 15;
        switch(day){

            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                    {
                System.out.println("\n\nInsert no of slots for " + day);
                final int noOfSlots = sc.nextInt();

                for (int i = 0; i < noOfSlots; i++) {
                    System.out.println("\nSLOT " + i + ": ");
                    System.out.println("\nInsert slot id :");
                    final int id=sc.nextInt();
                    System.out.println("\n Insert start time in format(hh:mm) :");
                    final String startTime = sc.next();



                    final String endDate = LocalDate.now().atTime(LocalTime.parse(startTime)).plusMinutes(slotWidth)
                            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

                    System.out.println(endDate);

                    final String[] s = endDate.split(" ");
                    String endTime = s[1];

                    final List<Slot> slotArray = slotMap.computeIfAbsent(day, (key) -> new ArrayList<Slot>());
                    slotArray.add(new Slot(startTime, endTime));
                }
                break;


            }


        }



        doctorHolder.addDoctor(doctorName, experience, specializations, fees, slotMap);
    }
}
