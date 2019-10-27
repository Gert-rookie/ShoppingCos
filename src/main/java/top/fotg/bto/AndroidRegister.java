package top.fotg.bto;

import java.io.Serializable;

/**
 * Created by lwc on 2019/6/25.
 */
public class AndroidRegister implements Serializable{
    private String phone;
    private String code;
    private String password;

    @Override
    public String toString() {
        return "AndroidRegister{" +
                "phone='" + phone + '\'' +
                ", code='" + code + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;


    public AndroidRegister() {
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
