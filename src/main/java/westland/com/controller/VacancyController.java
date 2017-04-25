package westland.com.controller;


/**
 * Created by west on 27.03.2017.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import westland.com.dto.ListOfVacanciesDto;
import westland.com.dto.VacancyDto;
import westland.com.entity.Employer;
import westland.com.json.JsonFilterVacancy;
import westland.com.json.JsonVacancy;
import westland.com.service.VacancyService;
import westland.com.entity.Vacancy;
import westland.com.service.EmployerService;

@RestController
    @RequestMapping (value = "/vacancy")
      public class VacancyController {

        @Autowired
        VacancyService vacService;

        @Autowired
        EmployerService emplService;

        @RequestMapping (value = "/filter")
        public ListOfVacanciesDto Vacancy(@RequestBody JsonFilterVacancy dataJson) {
            ListOfVacanciesDto list = new ListOfVacanciesDto();
            String typeQuery = dataJson.getTypeQuery();
            switch(typeQuery) {
                case "findFirstTen":
                    list.setVacancies(vacService.findFirstTen(dataJson.getSkip(),dataJson.getLimit()));
                    break;
                case "filterVacancy":
                    list.setVacancies(vacService.filterVacancy(dataJson.getId(),dataJson.getKeyWord(),dataJson.getLocation(),dataJson.getEducation(),dataJson.getProfessionalSector(),dataJson.getExperience(),dataJson.getContractType(),dataJson.getSkip(),dataJson.getLimit()));
                    break;
                default:
                    //System.out.println("This typeQuery did not find");
                    break;
            }
            return list;
        }

    @RequestMapping (value = "/create")
    public VacancyDto Vacancy(@RequestBody JsonVacancy dataJson) {
        VacancyDto v = new VacancyDto();
        String typeQuery = dataJson.getTypeQuery();
        switch(typeQuery) {
            case "createVacancy":
                Vacancy vacancy=new Vacancy();
                vacancy.setTitle(dataJson.getJobTitle());
                vacancy.setFunctiontitle(dataJson.getLocation());
                vacancy.setDateofpost(java.sql.Date.valueOf(dataJson.getDateOfPost()));
                vacancy.setWhatweoffer(dataJson.getVacancyDescription());
                vacancy.setPaid(0);
                vacancy.setLocations(dataJson.getLocation());
                vacancy.setEducation(dataJson.getEducation());
                vacancy.setExperience(Integer.parseInt(dataJson.getExperience()));
                vacancy.setContracttype(dataJson.getContractType());
                vacancy.setSector(dataJson.getProfessionalSector());
                vacancy.setSalary(dataJson.getSalary());
                Employer e = emplService.findByName(dataJson.getNameCompany());
                vacancy.setEmployerid(e.getId());//дописать преобразование имени в ид!!!!!
                vacService.createVacancy(vacancy);
                //  System.out.println(vacancy.getId());
                vacService.findById(vacancy.getId());
                // list.setVacancies(vacService.findById(vacancy.getId()));
                break;
            default:
                //System.out.println("This typeQuery did not find");
                break;
        }
        return v;
    }
}
