package top.fotg.entity;


import java.util.List;

public class Perfume {

  private long per_id;
  private String name;
  private String engname;
  private String picture;
  private List<PerContainer> list;

  public List<PerContainer> getList() {
    return list;
  }

  public void setList(List<PerContainer> list) {
    this.list = list;
  }

  public long getPer_id() {
    return per_id;
  }

  public void setPer_id(long per_id) {
    this.per_id = per_id;
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

}
