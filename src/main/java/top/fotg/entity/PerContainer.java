package top.fotg.entity;


public class PerContainer {

  private long per_id;
  private long capId;
  private long capacity;
  private double price;
  private long restnumber;


  public long getPer_id() {
    return per_id;
  }

  public void setPer_id(long per_id) {
    this.per_id = per_id;
  }

  public long getCapId() {
    return capId;
  }

  public void setCapId(long capId) {
    this.capId = capId;
  }


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

  public PerContainer(long capacity, double price, long restnumber) {
    this.capacity = capacity;
    this.price = price;
    this.restnumber = restnumber;
  }
}
