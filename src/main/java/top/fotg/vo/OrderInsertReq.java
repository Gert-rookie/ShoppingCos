package top.fotg.vo;

import java.util.List;

/**
 * 创建订单，请求参数
 */
public class OrderInsertReq {
    private long u_id;                                                              //用户ID
    private List<OrderInsertDetail> orderList;                                      //订单数组对象(可能包含多个商品)

    public long getU_id() {
        return u_id;
    }

    public void setU_id(long u_id) {
        this.u_id = u_id;
    }

    public List<OrderInsertDetail> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderInsertDetail> orderList) {
        this.orderList = orderList;
    }
}
