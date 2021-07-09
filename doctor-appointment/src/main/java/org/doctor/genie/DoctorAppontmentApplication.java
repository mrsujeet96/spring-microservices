package org.doctor.genie;

import org.doctor.genie.model.DataBase;
import org.doctor.genie.service.MenuProcessor;
import org.doctor.genie.service.MenuProcessorFactory;

import java.util.Scanner;

public class DoctorAppontmentApplication {

    private DataBase dataBase ;
    private MenuProcessorFactory menuProcessorFactory ;

    public static void main(String[] args) {

        DoctorAppontmentApplication appontmentApplication = new DoctorAppontmentApplication();
        appontmentApplication.startProcessing();

    }

    public DoctorAppontmentApplication(){
        this.dataBase = new DataBase();
        this.menuProcessorFactory = new MenuProcessorFactory();
    }

    private void startProcessing(){

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n\n *************** Doctor Appointment Application ********************");
            System.out.println("Here are the Menu Options \n"
                    + "Press 1 - Add Doctor\n" + "Press 2 - See all doctors \n" +
                    "Press 3 - To Select a Doctor\n" +
                    "Press 100 - To exit the application");

            final int optionSelected = sc.nextInt();
            if(optionSelected == 100){
                break;
            }

            processSelectedOption(optionSelected, sc);

        }
    }

    private void processSelectedOption(int optionSelected , Scanner sc){
        final MenuProcessor menuProcessor = this.menuProcessorFactory.fetchMenuProcessor(optionSelected);
        menuProcessor.process(dataBase, sc);
    }
}
