package top.fotg.service.serviceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import top.fotg.vo.Cart;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.util.CollectionUtils;
import top.fotg.service.CartService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author jake
 * @Date 2019/5/8 23:15
 */
@Service
public class CartServiceImpi implements CartService {

    @Autowired
    private  StringRedisTemplate redisTemplate;

    private  static String KEY="cart:u_id:";

    private final Logger logger= LoggerFactory.getLogger(CartServiceImpi.class);

    /**
     *
     * @param cart
     */
    @Override
    public int addCart(Cart cart) {  //添加到购物车

      /* UserBean userBean=JSONObject.parseObject(redisTemplate.opsForValue().get("userInfo"),UserBean.class);*/
        //System.out.println(userBean);
        String  key=KEY+cart.getU_id(); //用户id+自定义生成购物车唯一标识
        String  msg="";
        BoundHashOperations<String,Object,Object > hashOperations=redisTemplate.boundHashOps(key);
        Integer  id=cart.getId();
        String  product_id=cart.getProduct_id(); //产品唯一标识
        Integer pro_id=cart.getPro_id();
        int number=cart.getNumber();
       Boolean flag=hashOperations.hasKey( product_id);
       if(flag){  //存在
           String json=hashOperations.get(product_id).toString();
           cart=JSONObject.parseObject(json,Cart.class);
           cart.setNumber(cart.getNumber()+number);
       }else{
           //购物车传过来的对象就有用户id
       }
       hashOperations.put(cart.getProduct_id(), JSON.toJSONString(cart));
       return 1;

    }

    @Override
    public List<Cart> queryCartList(int u_id) {  //查询购物车
        String  key=KEY+String.valueOf(u_id); //用户id+自定义生成购物车唯一标识
        if(!redisTemplate.hasKey(key)){
            return null;
        }
        BoundHashOperations<String,Object,Object > hashOperations=redisTemplate.boundHashOps(key);
        List<Object> cartList=hashOperations.values();
        if(CollectionUtils.isEmpty(cartList)){
             return null;
        }
        return cartList.stream().map( o -> JSONObject.parseObject(o.toString(),Cart.class)).collect(Collectors.toList());
    }


    @Override
    public int deleteCart(String product_id, int u_id) { //删除单个产品
        String  key=KEY+u_id; //用户id+自定义生成购物车唯一标识
        BoundHashOperations<String,Object,Object > hashOperations=redisTemplate.boundHashOps(key);
        hashOperations.delete(product_id);
        return 1;
    }

    @Override
    public int cleanCart(int u_id, String[] keys) {  //全删
        String  key=KEY+u_id; //用户id+自定义生成购物车唯一标识
        BoundHashOperations<String,Object,Object > hashOperations=redisTemplate.boundHashOps(key);
        hashOperations.delete(keys);
         return 1;
    }

    @Override
    public int partCart(int u_id, String[] keys) {  //部分删
        String  key=KEY+u_id; //用户id+自定义生成购物车唯一标识
        BoundHashOperations<String,Object,Object > hashOperations=redisTemplate.boundHashOps(key);
        hashOperations.delete(keys);
        return 1;

    }
}
