package westland.com.entity;
import javax.persistence.*;
import java.sql.Date;
/**
 * Created by west on 12.04.2017.
 */

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int packageid;
    private int vacancyid;
    private java.sql.Date startdate;
    public Purchase(){};


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPackageid() {
        return packageid;
    }

    public void setPackageid(int packageid) {
        this.packageid = packageid;
    }

    public int getVacancyid() {
        return vacancyid;
    }

    public void setVacancyid(int vacancyid) {
        this.vacancyid = vacancyid;
    }

    public java.sql.Date getStartdate() {
        return startdate;
    }

    public void setStartdate(java.sql.Date startdate) {
        this.startdate = startdate;
    }
}
