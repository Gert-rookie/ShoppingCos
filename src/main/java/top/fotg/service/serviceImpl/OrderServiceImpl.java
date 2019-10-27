package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.fotg.service.OrderService;
import top.fotg.dao.OrderDao;
import top.fotg.entity.Orderdetail;
import top.fotg.util.NumberUtil;
import top.fotg.vo.OrderDetailList;
import top.fotg.vo.OrderInsertDetail;
import top.fotg.vo.OrderInsertReq;
import top.fotg.vo.OrderInsertRes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service("/orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate redisTemplate2;
    @Autowired
    private NumberUtil numberUtil;
    private String KEY_ORDER_ALL="orderAll";
    private String KEY_ORDER_LIST="orderList";
    @Override
    public int queryOrderAll(int u_id) {
        String key=KEY_ORDER_ALL+u_id;
        int res=0;
        if(redisTemplate.hasKey(key)){                              //判断有没缓存
            res= Integer.parseInt(redisTemplate2.opsForValue().get(key));
        }else{                                                        //没缓存就查数据库，并且存入缓存
        res=orderDao.queryOrderAll(u_id);
            redisTemplate2.opsForValue().set(key,res+"");
        }
        return res==0?1:res/10+1;                       //每页10条数据，防止没有数据时报异常
    }

    @Override
    public List<OrderDetailList> queryOrderList(int page, int u_id) {
        List<OrderDetailList> list=new ArrayList<>();
        String key=KEY_ORDER_LIST+u_id;
        if(page==1){
        if(redisTemplate.hasKey(key)){                                      //有缓存从缓存读
            list=redisTemplate.opsForList().range(key,0,-1);
        }else {                                                                //没缓存先查数据库，再加入缓存
            list = orderDao.query_Order_By_Uid_Page(u_id, page * 10 - 10, 10);
            redisTemplate.opsForList().rightPushAll(key,list);
        }}else{
            list = orderDao.query_Order_By_Uid_Page(u_id, page * 10 - 10, 10);
        }
        return list;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public OrderInsertRes insertOrder(OrderInsertReq orderInsertReq) {
        String key=KEY_ORDER_LIST+orderInsertReq.getU_id();
        long orderNumber=numberUtil.creatOrderNumber();             //订单号
        java.sql.Timestamp orderDate=new java.sql.Timestamp(System.currentTimeMillis());
        OrderInsertRes orderInsertRes=new OrderInsertRes();             //返回数据对象
        int flag=orderDao.insert_order(orderInsertReq.getU_id(),orderNumber,orderDate);
        if(flag>0){
                int flag2=orderDao.insert_orderList(orderNumber,orderInsertReq.getOrderList());
                if (flag2>0){                                  //两个都插入成功,返回订单日期和订单号
                   if(!OrderInsertCache(orderNumber,orderInsertReq.getOrderList(),orderInsertReq.getU_id(),orderDate)){               //添加缓存失败，直接让缓存失效
                        redisTemplate.delete(key);
                    }
                    orderInsertRes.setOrderDate(orderDate);
                    orderInsertRes.setOrderNumber(orderNumber);
                    return orderInsertRes;
                }
        }

        return orderInsertRes;
    }

    /**
     * 创建订单 ，添加缓存
     * @return
     */
    private boolean OrderInsertCache(long orderNumber, List<OrderInsertDetail> list, long u_id, java.sql.Timestamp orderDate){
        //添加缓存，rightpush，要解决  取数据时，订单详情列表多了个字段OrderNumber
        OrderDetailList orderDetailList=new OrderDetailList(orderNumber,orderDate,0,list);
        System.out.println(redisTemplate.opsForList().leftPush(KEY_ORDER_LIST+u_id,orderDetailList));
        redisTemplate.opsForList().rightPop(KEY_ORDER_LIST+u_id);               //右边弹出一个，保持十条缓存
        redisTemplate.opsForValue().increment(KEY_ORDER_ALL+u_id);                       //缓存订单总数+1
        return true;
    }

}
