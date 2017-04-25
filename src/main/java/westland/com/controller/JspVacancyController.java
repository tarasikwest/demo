package westland.com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import westland.com.dto.VacancyDto;
import westland.com.entity.Vacancy;
import westland.com.service.VacancyService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by west on 18.04.2017.
 */
@RestController

    @RequestMapping("/jspvacancy")
     public class JspVacancyController {
        List<VacancyDto> list = null;

    @Autowired
    VacancyService service;

    @RequestMapping(value = "/listOfNotPurchaseVacancies", method = 	RequestMethod.GET)
        public String showList(ModelMap model) {
            list = service.findFirstTen("1","5");
            if (list.size() == 0){System.out.println("Записей удовлетворяющих запросу ненайдено!");}
            model.addAttribute("vacanciesList", list);
            return "listOfNotPurchaseVacancies";
        }
    @RequestMapping(value = "/{vacancyId}", method = 	RequestMethod.GET)
    public String editVacancy(@PathVariable String vacancyId, ModelMap model) {
        int id = Integer.valueOf(vacancyId);
        VacancyDto vacancy = service.findById(id);
        model.addAttribute("vacancy", vacancy);
        return "newHlinks";
    }
    @RequestMapping(value = "/addVacancys", method = 	RequestMethod.POST)
    public String addHlinks(@Valid	@ModelAttribute("vacancy")Vacancy vacancy, BindingResult bindingResult, ModelMap model) {
        // System.out.println("addHlinks");
        if(bindingResult.hasErrors()) { return "newVacancy"; }
        service.createVacancy(vacancy);
        list = service.findFirstTen("1","5");
        model.addAttribute("vanciesList", list);
        return "listOfNotPurchaseVacancies";
    }


    }
