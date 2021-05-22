package com.employee.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Dependants {
//     First Name, Last Name, Gender, DOB, Relationship
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String Gender;
    private Date depDob;
    private String relationship;

    public Dependants() {

    }

    public Dependants(Long id, String firstName, String lastName, String gender, Date depDob, String relationship) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Gender = gender;
        this.depDob = depDob;
        this.relationship = relationship;
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
}
