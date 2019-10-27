package top.fotg.entity.user;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by lwc on 2019/5/8.
 */

public class User implements Serializable{
    int u_id;
    private String u_lastname;

    private String u_sex;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date u_birth;
    private String u_idcard;
    private String u_phone;
    private String u_email;
    private String u_pwd;
    private String user_phone;
    private String u_status;
    List<Address> address;

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_lastname='" + u_lastname + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_birth=" + u_birth +
                ", u_idcard='" + u_idcard + '\'' +
                ", u_phone='" + u_phone + '\'' +
                ", u_email='" + u_email + '\'' +
                ", u_pwd='" + u_pwd + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", u_status='" + u_status + '\'' +
                ", address=" + address +
                '}';
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public User() {
    }

    public int getU_id() {

        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_lastname() {
        return u_lastname;
    }

    public void setU_lastname(String u_lastname) {
        this.u_lastname = u_lastname;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public Date getU_birth() {
        return u_birth;
    }


    public void setU_birth(Date u_birth) {
        this.u_birth = u_birth;
    }

    public String getU_idcard() {
        return u_idcard;
    }

    public void setU_idcard(String u_idcard) {
        this.u_idcard = u_idcard;
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

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getU_status() {
        return u_status;
    }

    public void setU_status(String u_status) {
        this.u_status = u_status;
    }


}
