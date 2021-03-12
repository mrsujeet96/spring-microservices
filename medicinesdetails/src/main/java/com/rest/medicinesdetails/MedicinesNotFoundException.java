package com.rest.medicinesdetails;

public class MedicinesNotFoundException extends Exception{

        private long c_unique_code;
        public MedicinesNotFoundException(int c_unique_code) {
            super(String.format("Book is not found with id : '%s'", c_unique_code));
        }
    }

