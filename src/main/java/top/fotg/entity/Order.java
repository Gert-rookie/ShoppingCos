package top.fotg.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 订单表
 */
public class Order {

  private long orderNumber;                                                   //订单号
  private java.sql.Timestamp orderDate;                                         //订单时间
  private long goodsStatus;                                                   //订单状态
  private long uId;                                                              //用户ID


  public long getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(long orderNumber) {
    this.orderNumber = orderNumber;
  }

  @JsonFormat(pattern="yy-MM-dd HH:mm")
  public java.sql.Timestamp getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Timestamp orderDate) {
    this.orderDate = orderDate;
  }


  public long getGoodsStatus() {
    return goodsStatus;
  }

  public void setGoodsStatus(long goodsStatus) {
    this.goodsStatus = goodsStatus;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }

}
