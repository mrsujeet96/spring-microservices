package doctormenudriven;


import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        int ch;

        Scanner sc = new Scanner(System.in);

        ArrayList<Doctor> list = new ArrayList<>();
        Doctor dr = new Doctor();
        list.add(new Doctor(2, "sumit", "4 years", "Bons", 300));
        list.add(new Doctor(3, "sumit", "4 years", "Bons", 300));
        list.add(new Doctor(5, "sumit", "4 years", "Bons", 300));

         while(true){

            System.out.println("Choose the options");
            System.out.println("1.Admin" + "2. Doctor" + "3.Patient");
             ch = sc.nextInt();


        switch (ch) {

            case 1:

                System.out.println("welcome to admin page");


             while (true) {
                 System.out.println("1.Add doctor" + "2.doctor list");
                 ch = sc.nextInt();

                 switch (ch) {
                     case 1:

                         dr.addNewDoctor();
                         list.add(dr);

                         break;

                     case 2:
                         for (Doctor doc : list) {
                             System.out.println(doc.toString());
                         }



                         break;
                     default:

                 }

                 break;
             }

            case 2:
                System.out.println("welcome to Doctor page");

                break;
            case 3:
                System.out.println("Welcome to Patient page");




                break;
            default:
                System.out.println("Invalid Choice");

        }

    }
    }
}
