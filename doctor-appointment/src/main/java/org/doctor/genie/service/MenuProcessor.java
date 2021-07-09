package org.doctor.genie.service;

import org.doctor.genie.model.DataBase;

import java.util.Scanner;

public interface MenuProcessor {

    void process(DataBase dataBase, Scanner sc);
}
