package top.fotg.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import top.fotg.entity.Orderdetail;

import java.sql.Timestamp;
import java.util.List;

/**
 * 用户订单列表,返回给前端显示
 */
public class OrderDetailList {
    private long orderNumber;                                                   //订单号
    private java.sql.Timestamp orderDate;                                         //订单时间
    private long goodsStatus;                                                   //订单状态
    private List<OrderInsertDetail> goodsList;

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }
    @JsonFormat(pattern="yy-MM-dd HH:mm",timezone = "GMT+8")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public long getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(long goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public List<OrderInsertDetail> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<OrderInsertDetail> goodsList) {
        this.goodsList = goodsList;
    }

    public OrderDetailList(){}

    public OrderDetailList(long orderNumber, Timestamp orderDate, long goodsStatus, List<OrderInsertDetail> goodsList) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.goodsStatus = goodsStatus;
        this.goodsList = goodsList;
    }
}
