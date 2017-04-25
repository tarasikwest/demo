package westland.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import westland.com.dao.EmployerDao;
import westland.com.entity.Employer;

/**
 * Created by west on 26.03.2017.
 */

    @Service
    public class EmployerServiceImpl implements EmployerService {

        @Autowired
        private EmployerDao EmployerDao;

        public Employer findByName(String companyname){
                Employer e= EmployerDao.findByName(companyname);
        return e    ;
    }

}
