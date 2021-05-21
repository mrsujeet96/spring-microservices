package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {
    //    ID,
//    First Name, Last Name, Employment ID, Start Date, Designation, Department, End
//    date, Status, DOB, Reporting Manager, gender, blood group, address

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int employmentId;
    private Date startDate;
    private String designation;
    private String department;
    private Date endDate;
    private String status;
    private Date dob;
    private String reportingManager;
    private String gender;
    private String bloodGroup;
    private String address;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, int employmentId, Date startDate, String designation, String department, Date endDate, String status, Date dob, String reportingManager, String gender, String bloodGroup, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentId = employmentId;
        this.startDate = startDate;
        this.designation = designation;
        this.department = department;
        this.endDate = endDate;
        this.status = status;
        this.dob = dob;
        this.reportingManager = reportingManager;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(int employmentId) {
        this.employmentId = employmentId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
