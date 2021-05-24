package com.employee.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Dependants {
//     First Name, Last Name, Gender, DOB, Relationship
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dep_id;
    private String firstName;
    private String lastName;
    private String Gender;
    private Date depDob;
    private String relationship;
    private int employmentId;



    public Dependants() {

    }

    public Dependants(Long dep_id, String firstName, String lastName, String gender, Date depDob, String relationship, int employmentId) {
        this.dep_id = dep_id;
        this.firstName = firstName;
        this.lastName = lastName;
        Gender = gender;
        this.depDob = depDob;
        this.relationship = relationship;
        this.employmentId = employmentId;
    }

    public Long getDep_id() {
        return dep_id;
    }

    public void setDep_id(Long dep_id) {
        this.dep_id = dep_id;
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getDepDob() {
        return depDob;
    }

    public void setDepDob(Date depDob) {
        this.depDob = depDob;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public int getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(int employmentId) {
        this.employmentId = employmentId;
    }
}
