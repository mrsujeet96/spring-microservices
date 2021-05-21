package com.employee.model;

import java.util.Date;

public class EducationalQualification {
//    Type, Start Date, End Date, Type, Institution, Address, Percentage
    private String type;
    private Date startDate;
    private Date endDate;
    private String institution;
    private String address;
    private  int percentage;

    public EducationalQualification() {
    }

    public EducationalQualification(String type, Date startDate, Date endDate, String institution, String address, int percentage) {
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.institution = institution;
        this.address = address;
        this.percentage = percentage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}