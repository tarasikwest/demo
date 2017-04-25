package westland.com.dto;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by west on 13.04.2017.
 */

public class ListOfVacanciesDto {
    private List<VacancyDto> vacancies;

    public ListOfVacanciesDto(){
        vacancies = new ArrayList<VacancyDto>();
    }

    public List<VacancyDto> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<VacancyDto> vacancies) {
        this.vacancies = vacancies;
    }
}
