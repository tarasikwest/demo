package westland.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import westland.com.dto.VacancyDto;
import westland.com.entity.Vacancy;
import westland.com.dao.VacancyDao;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by west on 26.03.2017.
 */

    @Service
    public class VacancyServiceImpl implements VacancyService {
        @Autowired
        private VacancyDao vacancyDao;
        public VacancyDto findById(int id){
                VacancyDto v = vacancyDao.findById(id);
        return v    ;
    }
        public List<VacancyDto> findFirstTen(String skip, String limit){
            //JsonVacancy dataJson = new JsonVacancy();
            List<VacancyDto>List = vacancyDao.findFirstTen(skip, limit);
            return List;
           }
        public List<VacancyDto> filterVacancy(String id, String keyWord, String location, ArrayList education, ArrayList professionalSector, String experience, ArrayList contractType, String skip, String limit){
         List<VacancyDto>List = vacancyDao.filterVacancy(id, keyWord, location, education, professionalSector, experience, contractType, skip, limit);
           return List;
    }
    @Transactional
    public void createVacancy(Vacancy vacancy){
        vacancyDao.createVacancy(vacancy);
    }
}
