package top.fotg.bto;

/**
 * Created by lwc on 2019/5/10.
 */
public class UpdateUserBto {
    String u_id;

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    String year;
    String month;
    String day;
    String u_sex;
    String u_lastname;
    String u_phone;
    String u_email;

    @Override
    public String toString() {
        return "UpdateUserBto{" +
                "u_id='" + u_id + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_lastname='" + u_lastname + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_email='" + u_email + '\'' +
                '}';
    }

    public UpdateUserBto() {
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public String getU_lastname() {
        return u_lastname;
    }

    public void setU_lastname(String u_lastname) {
        this.u_lastname = u_lastname;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }



    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }
}
