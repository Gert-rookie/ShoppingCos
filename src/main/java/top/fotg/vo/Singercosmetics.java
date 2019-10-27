package top.fotg.vo;

import java.util.List;

public class Singercosmetics {
    private String name;
    private String engname;
    private List<Color> capacity_arr;
    private String picture;
    private double price;

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

    public List<Color> getCapacity_arr() {
        return capacity_arr;
    }

    public void setCapacity_arr(List<Color> capacity_arr) {
        this.capacity_arr = capacity_arr;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Singercosmetics(String name, String engname, List<Color> capacity_arr, String picture, double price) {
        this.name = name;
        this.engname = engname;
        this.capacity_arr = capacity_arr;
        this.picture = picture;
        this.price = price;
    }
}
