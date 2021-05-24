package com.employee.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Qualification")
public class EducationalQualification {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long edu_id;
    private String type;
    private Date startDate;
    private Date endDate;
    private String institution;
    private String address;
    private int percentage;
    private int employmentId;

    public EducationalQualification() {
    }

    public EducationalQualification(Long edu_id, String type, Date startDate, Date endDate, String institution, String address, int percentage, int employmentId) {
        this.edu_id = edu_id;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.institution = institution;
        this.address = address;
        this.percentage = percentage;
        this.employmentId = employmentId;
    }

    public Long getEdu_id() {
        return edu_id;
    }

    public void setEdu_id(Long edu_id) {
        this.edu_id = edu_id;
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

    public int getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(int employmentId) {
        this.employmentId = employmentId;
    }
}
