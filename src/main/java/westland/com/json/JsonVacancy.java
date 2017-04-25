package westland.com.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by west on 06.04.2017.
 */
public class JsonVacancy {
    @JsonProperty("typeQuery")
    String typeQuery;

    @JsonProperty("id")
    String id;

    @JsonProperty("jobTitle")
    String jobTitle;

    @JsonProperty("functionTitle")
    String functionTitle;

    @JsonProperty("nameCompany")
    String nameCompany;

    @JsonProperty("location")
    String location;

    @JsonProperty("education")
    String education;

    @JsonProperty("professionalSector")
    String professionalSector;

    @JsonProperty("experience")
    String experience;

    @JsonProperty("contractType")
    String contractType;

    @JsonProperty("VacancyDescription")
    String VacancyDescription;

    @JsonProperty("paid")
    String paid;

    @JsonProperty("salary")
    String salary;

    @JsonProperty("dateOfPost")
    String dateOfPost;

    @JsonProperty("skip")
    String skip;

    @JsonProperty("limit")
    String limit;

    public String getTypeQuery() {
        return typeQuery;
    }

    public void setTypeQuery(String typeQuery) {
        this.typeQuery = typeQuery;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFunctionTitle() {
        return functionTitle;
    }

    public void setFunctionTitle(String functionTitle) {
        this.functionTitle = functionTitle;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfessionalSector() {
        return professionalSector;
    }

    public void setProfessionalSector(String professionalSector) {
        this.professionalSector = professionalSector;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getVacancyDescription() {
        return VacancyDescription;
    }

    public void setVacancyDescription(String vacancyDescription) {
        VacancyDescription = vacancyDescription;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(String dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
}
