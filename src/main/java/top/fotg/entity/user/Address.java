package top.fotg.entity.user;

import java.io.Serializable;

/**
 * Created by lwc on 2019/5/10.
 */
public class Address implements Serializable{
    private Integer a_id;
    private Integer u_id;
    private String a_lastname;

    public Address(Integer a_id, Integer u_id, String a_lastname, String province, String city, String area, String other, String a_sex, String a_phone, String a_moren) {
        this.a_id = a_id;
        this.u_id = u_id;
        this.a_lastname = a_lastname;
        this.province = province;
        this.city = city;
        this.area = area;
        this.other = other;
        this.a_sex = a_sex;
        this.a_phone = a_phone;
        this.a_moren = a_moren;
    }

    public Address() {

    }

    private String province;
    private String city;
    private String area;
    private String other;
    private String a_sex;
    private String a_phone;
    private String a_moren;

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_lastname() {
        return a_lastname;
    }

    public void setA_lastname(String a_lastname) {
        this.a_lastname = a_lastname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getA_sex() {
        return a_sex;
    }

    public void setA_sex(String a_sex) {
        this.a_sex = a_sex;
    }

    public String getA_phone() {
        return a_phone;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public String getA_moren() {
        return a_moren;
    }

    public void setA_moren(String a_moren) {
        this.a_moren = a_moren;
    }
}
