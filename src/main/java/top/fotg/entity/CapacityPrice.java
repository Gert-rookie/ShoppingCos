package top.fotg.entity;

/**
 * Created by LHX on 2019/5/10.
 */
public class CapacityPrice {
    private String percon_id;
    private int restnumber;
    private float price;
    private int capacity;

    public CapacityPrice() {
    }

    public String getPercon_id() {
        return percon_id;
    }

    public void setPercon_id(String percon_id) {
        this.percon_id = percon_id;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
