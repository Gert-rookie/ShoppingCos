package top.fotg.entity;


public class Orderdetail {

  private long orderNumber;
  private long orderType;
  private long orderId;
  private double goodsMoney;
  private long goodsNumber;
  private String goodsDetail;
  private String goodsDetail2;
  private String goodsImg;


  public long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(long orderNumber) {
    this.orderNumber = orderNumber;
  }


  public long getOrderType() {
    return orderType;
  }

  public void setOrderType(long orderType) {
    this.orderType = orderType;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public double getGoodsMoney() {
    return goodsMoney;
  }

  public void setGoodsMoney(double goodsMoney) {
    this.goodsMoney = goodsMoney;
  }


  public long getGoodsNumber() {
    return goodsNumber;
  }

  public void setGoodsNumber(long goodsNumber) {
    this.goodsNumber = goodsNumber;
  }


  public String getGoodsDetail() {
    return goodsDetail;
  }

  public void setGoodsDetail(String goodsDetail) {
    this.goodsDetail = goodsDetail;
  }


  public String getGoodsDetail2() {
    return goodsDetail2;
  }

  public void setGoodsDetail2(String goodsDetail2) {
    this.goodsDetail2 = goodsDetail2;
  }


  public String getGoodsImg() {
    return goodsImg;
  }

  public void setGoodsImg(String goodsImg) {
    this.goodsImg = goodsImg;
  }

}
