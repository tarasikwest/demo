package westland.com.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Created by west on 06.04.2017.
 */
public class JsonFilterVacancy {
    @JsonProperty("typeQuery")
    String typeQuery;

    @JsonProperty("id")
    String id;

    @JsonProperty("keyWord")
    String keyWord;

    @JsonProperty("location")
    String location;

    @JsonProperty("education")
    ArrayList education;

    @JsonProperty("professionalSector")
    ArrayList professionalSector;

    @JsonProperty("experience")
    String experience;

    @JsonProperty("contractType")
    ArrayList contractType;

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

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList getEducation() {
        return education;
    }

    public void setEducation(ArrayList education) {
        this.education = education;
    }

    public ArrayList getProfessionalSector() {
        return professionalSector;
    }

    public void setProfessionalSector(ArrayList professionalSector) {
        this.professionalSector = professionalSector;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public ArrayList getContractType() {
        return contractType;
    }

    public void setContractType(ArrayList contractType) {
        this.contractType = contractType;
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
