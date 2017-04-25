package westland.com.dao;

import org.springframework.stereotype.Repository;
import westland.com.dto.VacancyDto;
import westland.com.entity.Vacancy;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by west on 26.03.2017.
 */
@Repository

public class VacancyDaoImpl implements VacancyDao{
    List<VacancyDto> list = null;

    @PersistenceContext
    private EntityManager em;

    public VacancyDto findById(int id){
        TypedQuery<VacancyDto> query = em.createQuery("SELECT v FROM Vacancy v WHERE v.id="+id, VacancyDto.class);
        VacancyDto v = query.getSingleResult();
        return v; }
    public List<VacancyDto> findFirstTen(String slip, String limit){
    //    TypedQuery<VacancyDto> query = em.createQuery("SELECT v FROM Vacancy v  ORDER BY v.purchases DESC, v.dateofpost DESC", VacancyDto.class);
    //    TypedQuery<VacancyDto> query = em.createQuery("SELECT new westland.com.dto.VacancyDto(v.title, v.functiontitle, v.dateofpost, v.whatweoffer, v.purchases, v.locations, v.education,v.experience, v.contracttype, v.sector, e.companyname) FROM Vacancy v LEFT JOIN v.Purchase p ON v.id=p.vacancyid LEFT JOIN v.Employer e ON p.employerid=e.id ORDER BY v.purchases DESC, v.dateofpost DESC", VacancyDto.class);
        TypedQuery<VacancyDto> query = em.createQuery("SELECT new westland.com.dto.VacancyDto(v.title, v.functiontitle, v.dateofpost, v.whatweoffer, v.paid, v.locations, v.education,v.experience, v.contracttype, v.sector, e.companyname) FROM Vacancy v, Employer e WHERE v.employerid=e.id ORDER BY v.paid DESC, v.dateofpost DESC", VacancyDto.class);
        list = query.getResultList().subList(Integer.valueOf(slip)-1,Integer.valueOf( limit));
        return list; }
    public List<VacancyDto> filterVacancy(String id, String keyWord, String location, ArrayList education, ArrayList professionalSector, String experience, ArrayList contractType, String skip, String limit){
        String txt="";
        txt= "SELECT v FROM Vacancy v WHERE v.title like '%" + keyWord+"%'";
        if (location!="")  {txt+=" AND v.locations = '"+location+"'";}
        if (education.size() > 0) {txt+=" AND v.education = '"+String.join("' AND v.education = '",education)+"'";}
        if (professionalSector.size() > 0) {txt+=" AND v.sector = '"+String.join("' AND v.sector = '",professionalSector)+"'";}
        if (experience!="") {txt+=" AND v.experience = "+Integer.valueOf(experience);}
        if (contractType.size() > 0) {txt+=" AND v.contracttype = '"+String.join("' AND v.contracttype = '",contractType)+"'";}
        txt+=" Order by v.paid DESC, v.dateofpost DESC";
        TypedQuery<VacancyDto> query = em.createQuery(txt, VacancyDto.class);
        list = query.getResultList();//.subList(Integer.valueOf(slip)-1,Integer.valueOf( limit));
        return list;
    }

    public void createVacancy(Vacancy vacancy){
        if (vacancy.getId() == 0)
            em.persist(vacancy);
        else
            em.merge(vacancy);

    }
  }