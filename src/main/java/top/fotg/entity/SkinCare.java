package top.fotg.entity;


public class SkinCare {

  private long skinId;
  private String name;
  private String engname;
  private long number;
  private double price;
  private long capacity;
  private String picture;


  public long getSkinId() {
    return skinId;
  }

  public void setSkinId(long skinId) {
    this.skinId = skinId;
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


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getCapacity() {
    return capacity;
  }

  public void setCapacity(long capacity) {
    this.capacity = capacity;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

}
