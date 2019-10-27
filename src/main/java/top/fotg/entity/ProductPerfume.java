package top.fotg.entity;

import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 */
public class ProductPerfume {
    private String id;
    private String name;
    private String engname;
    private String picture;
    private List<CapacityPrice> capacityPriceList ;


    public ProductPerfume() {

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<CapacityPrice> getCapacityPriceList() {
        return capacityPriceList;
    }

    public void setCapacityPriceList(List<CapacityPrice> capacityPriceList) {
        this.capacityPriceList = capacityPriceList;
    }
}
