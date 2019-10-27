package top.fotg.entity;

import top.fotg.vo.Color;

import java.util.List;

/**
 * 彩妆表
 */
public class Cosmetics {

  private long cos_id;            //主键
  private String name;            //名字
  private String engname;         //英语名
  private double price;           //价格
  private String picture;       //图片
  private List<Color> list;

  public List<Color> getList() {
    return list;
  }

  public void setList(List<Color> list) {
    this.list = list;
  }

  public long getCos_id() {
    return cos_id;
  }

  public void setCos_id(long cos_id) {
    this.cos_id = cos_id;
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


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

}
