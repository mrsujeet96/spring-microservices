package doctormenudriven;

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class Doctor {

    int d_id;
    String d_name;
    String experience;
    String speciality;
    int fees;

    public enum Days {
        Monday, Tuesday, Wednesday, Thursday ,Friday,Saturday;
    };
    EnumMap<Days,String> map=new EnumMap<>(Days.class);




    public Doctor(int d_id, String d_name, String experience, String speciality, int fees) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.experience = experience;
        this.speciality = speciality;
        this.fees = fees;
    }

    public Doctor() {

    }

    public void addNewDoctor() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new  doctor details");

        System.out.println("ID");
        d_id = sc.nextInt();

        System.out.println("Name: ");
        d_name = sc.next();

        System.out.println("experience");
        experience = sc.next();

        System.out.println("speciality");
        speciality = sc.next();

        System.out.println("fees");
        fees = sc.nextInt();


    }


    @Override
    public String toString() {
        return "Doctor{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", experience='" + experience + '\'' +
                ", speciality='" + speciality + '\'' +
                ", fees=" + fees +
                '}';
    }


}

