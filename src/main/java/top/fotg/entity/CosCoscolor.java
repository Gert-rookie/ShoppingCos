package top.fotg.entity;

import top.fotg.vo.Color;
import top.fotg.vo.SingerCom;

import java.util.List;

/**
 * 彩妆色号表
 */
public class CosCoscolor {

  private long id;                      //主键
  private long color_id;               //cos_color表主键
  private long cos_id;                 //彩妆表(cosmetics)id
  private long restnumber;            //每种产品颜色对应数量


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getColor_id() {
    return color_id;
  }

  public void setColor_id(long color_id) {
    this.color_id = color_id;
  }

  public long getCos_id() {
    return cos_id;
  }

  public void setCos_id(long cos_id) {
    this.cos_id = cos_id;
  }

  public long getRestnumber() {
    return restnumber;
  }

  public void setRestnumber(long restnumber) {
    this.restnumber = restnumber;
  }

}
