package westland.com.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by west on 12.04.2017.
 */
@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String companyname;
    private int contactinfo;
    public Employer(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(int contactinfo) {
        this.contactinfo = contactinfo;
    }
}
