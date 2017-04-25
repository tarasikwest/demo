package westland.com.dao;

import org.springframework.stereotype.Repository;
import westland.com.entity.Employer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 * Created by west on 26.03.2017.
 */
@Repository

public class EmployerDaoImpl implements EmployerDao{

      @PersistenceContext
    private EntityManager em;

    public Employer findByName(String nameCompany){
        TypedQuery<Employer> query = em.createQuery("SELECT v FROM Vacancy v WHERE v.id="+nameCompany, Employer.class);
        Employer e = query.getSingleResult();
        return e; }
    }