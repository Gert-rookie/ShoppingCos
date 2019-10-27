package top.fotg.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.fotg.entity.Order;
import top.fotg.vo.OrderDetailList;
import top.fotg.vo.OrderInsertDetail;

import java.util.List;

/**
 * 订单接口
 */
@Repository(value = "orderDao")
public interface OrderDao {
    /**
     * 根据用户ID查询该用户总订单条数
     * @param u_id
     * @return
     */
    public int queryOrderAll(@Param("u_id")int u_id);

    /**
     * 根据用户ID，页码 查询订单列表
     * @param u_id             用户ID
     * @param start_page       起始位置
     * @param end_page
     * @return
     */
    public List<OrderDetailList> query_Order_By_Uid_Page(@Param("u_id")int u_id, @Param("start_page")int start_page, @Param("end_page")int end_page);

    /**
     * 创建订单
     * @param u_id              用户ID
     * @param orderNumber      订单号
     * @param orderDate          创建订单时间
     * @return                  1代表成功
     */
    public int insert_order(@Param("u_id")long u_id,@Param("orderNumber")long orderNumber,@Param("orderDate")java.sql.Timestamp orderDate);

    /**
     * 根据订单号，批量插入订单详情
     * @param orderNumber               订单号
     * @param orderList                 订单详情列表
     * @return                      1代表成功
     */
    public int insert_orderList(@Param("orderNumber")long orderNumber,@Param("orderList") List<OrderInsertDetail> orderList);
}
