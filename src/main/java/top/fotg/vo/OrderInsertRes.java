package top.fotg.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

/**
 * 创建订单，返回数据
 */
public class OrderInsertRes {
       private long orderNumber;                                                   //订单号
        private java.sql.Timestamp orderDate;                                         //订单时间
    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }
    @JsonFormat(pattern="yy-MM-dd HH:mm")
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}
