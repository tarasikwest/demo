package westland.com.dto;

import java.sql.Date;

/**
 * Created by west on 22.03.2017.
 */

public class VacancyDto  {
    private String title;
    private String functiontitle;
    private java.sql.Date dateofpost;
    private String whatweoffer;
    private int paid; //flag 0 not Sponsored, flag 1 Sponsored
    private String locations;
    private String education;
    private int experience;
    private String contracttype;
    private String sector;
    private String companyname;

    public VacancyDto(){}

    public VacancyDto(String title, String functiontitle, java.sql.Date dateofpost, String whatweoffer, int paid, String locations, String education, int experience, String contracttype, String sector, String companyname){
        this.title=title;
        this.functiontitle=functiontitle;
        this.dateofpost=dateofpost;
        this.whatweoffer=whatweoffer;
        this.paid=paid;
        this.locations=locations;
        this.education=education;
        this.experience=experience;
        this.contracttype=contracttype;
        this.sector=sector;
        this.companyname=companyname;
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

    public void setDateofpost(java.sql.Date dateofpost) {
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

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}

