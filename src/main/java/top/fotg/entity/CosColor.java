package top.fotg.entity;

/**
 * 色号表
 */
public class CosColor {

  private long color_id;                  //颜色id
  private String color;                     //色号
  private String colorName;               //颜色名


  public long getColor_id() {
    return color_id;
  }

  public void setColor_id(long color_id) {
    this.color_id = color_id;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }

}
