package westland.com.dao;

import westland.com.entity.Employer;

/**
 * Created by west on 26.03.2017.
 */
public interface EmployerDao {
        public Employer findByName(String companyname);
  }


