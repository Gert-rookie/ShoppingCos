package top.fotg.service;

import top.fotg.vo.OrderDetailList;
import top.fotg.vo.OrderInsertDetail;
import top.fotg.vo.OrderInsertReq;
import top.fotg.vo.OrderInsertRes;

import java.util.List;


public interface OrderService {
    /**
     * 查询总页数
     * @param u_id
     * @return
     */
    public int queryOrderAll(int u_id);

    /**
     * 通过页码和用户ID查询订单列表
     * @param page
     * @param u_id
     * @return
     */
    public List<OrderDetailList> queryOrderList(int page, int u_id);

    /**
     * 创建订单，添加订单信息到数据库
     * @param orderInsertReq
     * @return
     */
    public OrderInsertRes insertOrder(OrderInsertReq orderInsertReq);
}
