package top.fotg.Dao;

import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import top.fotg.ShoppingMallApplication;
import top.fotg.dao.OrderDao;
import top.fotg.util.NumberUtil;
import top.fotg.vo.OrderDetailList;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShoppingMallApplication.class)
public class orderDaoTest {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private NumberUtil numberUtil;
    @Test
    public void test(){
        List<OrderDetailList> res=orderDao.query_Order_By_Uid_Page(1608030149,0,10);
        System.out.println(res);
    }
    @Test
    public void testRedis(){
        System.out.println(numberUtil.creatOrderNumber());
    }
}
