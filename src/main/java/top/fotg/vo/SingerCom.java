package top.fotg.vo;

import java.util.List;

/**
 * 香水类，护肤类
 */
public class SingerCom {
        private String name;
        private String engname;
        private List<PerContainerRes> capacity_arr;
        private String picture;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public List<PerContainerRes> getCapacity_arr() {
        return capacity_arr;
    }

    public void setCapacity_arr(List<PerContainerRes> capacity_arr) {
        this.capacity_arr = capacity_arr;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public SingerCom(String name, String engname, List<PerContainerRes> capacity_arr, String picture) {
        this.name = name;
        this.engname = engname;
        this.capacity_arr = capacity_arr;
        this.picture = picture;
    }
}
