package top.fotg.vo;

public class PerContainerRes {
    private long capacity;
    private double price;
    private long restnumber;


    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getRestnumber() {
        return restnumber;
    }

    public void setRestnumber(long restnumber) {
        this.restnumber = restnumber;
    }


    public PerContainerRes(long capacity, double price, long restnumber) {
        this.capacity = capacity;
        this.price = price;
        this.restnumber = restnumber;
    }
}
