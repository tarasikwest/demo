package westland.com.entity;


import java.util.*;
/**
 * Created by west on 13.04.2017.
 */

public class ListOfVacancies {
    private List<Vacancy> vacancies;

    public ListOfVacancies(){
        vacancies = new ArrayList<Vacancy>();
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }
}
