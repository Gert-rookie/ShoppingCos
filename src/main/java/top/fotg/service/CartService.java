package top.fotg.service;

import top.fotg.vo.Cart;

import java.util.List;


/**
 * @Author jake
 * @Date 2019/5/8 23:15
 */
public interface CartService {

    int addCart(Cart cart);
    List<Cart>  queryCartList(int u_id);
    int deleteCart(String product_id,int u_id);
    int cleanCart(int u_id, String[] keys);
    int partCart(int u_id,String keys[]);
}
