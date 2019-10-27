package top.fotg.entity;

import java.util.List;

/**
 * Created by LHX on 2019/5/8.
 */
public class ProductWithColor {
    private String id;
    private String name;
    private String engname;
    private int restnumber;
    private float price;
    private String picture;
    private List<String> color;



    public ProductWithColor() {
    }

    public ProductWithColor(String id, String name, String engname, int restnumber, float price, String picture, List<String> color) {
        this.id = id;
        this.name = name;
        this.engname = engname;
        this.restnumber = restnumber;
        this.price = price;
        this.picture = picture;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ProductWithColor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", engname='" + engname + '\'' +
                ", restnumber=" + restnumber +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", color=" + color +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getRestnumber() {
        return restnumber;
    }

    public void setRestnumber(int restnumber) {
        this.restnumber = restnumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }
}
