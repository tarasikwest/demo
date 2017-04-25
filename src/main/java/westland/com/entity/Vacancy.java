package westland.com.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by west on 22.03.2017.
 */

@Entity
public class Vacancy {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String title;
   // @Column(name = "function_title")
    //private String functionTitle;
    private String functiontitle;
    private java.sql.Date dateofpost;
    private String whatweoffer;
    private int paid; //flag 0 not Sponsored, flag 1 Sponsored
    private String locations;
    private String education;
    private int experience;
    private String contracttype;
    private String sector;
    private int employerid;
    private String salary;

    public Vacancy(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFunctiontitle() {
        return functiontitle;
    }

    public void setFunctiontitle(String functiontitle) {
        this.functiontitle = functiontitle;
    }

    public Date getDateofpost() {
        return dateofpost;
    }

    public void setDateofpost(Date dateofpost) {
        this.dateofpost = dateofpost;
    }

    public String getWhatweoffer() {
        return whatweoffer;
    }

    public void setWhatweoffer(String whatweoffer) {
        this.whatweoffer = whatweoffer;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getContracttype() {
        return contracttype;
    }

    public void setContracttype(String contracttype) {
        this.contracttype = contracttype;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getEmployerid() {
        return employerid;
    }

    public void setEmployerid(int employerid) {
        this.employerid = employerid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

