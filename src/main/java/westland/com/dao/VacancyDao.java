package westland.com.dao;

import westland.com.dto.VacancyDto;
import westland.com.entity.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by west on 26.03.2017.
 */
public interface VacancyDao {
        public VacancyDto findById(int id);
        public List<VacancyDto> findFirstTen(String skip, String limit);
        public List<VacancyDto>filterVacancy(String id, String keyWord, String location, ArrayList education, ArrayList professionalSector, String experience, ArrayList contractType, String skip, String limit);
        public void createVacancy(Vacancy vacancy);
}


