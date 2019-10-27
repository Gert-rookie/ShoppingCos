package top.fotg.controller;


import org.springframework.stereotype.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import top.fotg.service.CartService;
import top.fotg.vo.Cart;


import java.util.List;


/**
 * @Author jake
 * @Date 2019/5/8 23:13
 */

@RequestMapping("/Com")
@Controller
@Api("购物车")
public class CartController {

    @Autowired
    private  CartService  cartService;

    @ResponseBody
    @ApiOperation("添加购物车")
    @PostMapping("/addCartList")
    public  int addCart(@RequestBody Cart cart){
       return cartService.addCart(cart);
    }
    @ResponseBody
    @ApiOperation("查询购物车")
    @PostMapping("/queryCartList")
    public List<Cart> queryCartInfo(@RequestBody int u_id){
        return cartService.queryCartList(u_id);
    }


    @ResponseBody
    @ApiOperation("删除单个产品")
    @DeleteMapping("/delCart")
    public int deleteCart(@RequestParam( "product_id") String product_id,@RequestParam( "u_id") Integer u_id){
         cartService.deleteCart(product_id,u_id);
         return 1;
    }

    @ResponseBody
    @ApiOperation("删除全部产品")
    @DeleteMapping("/cleanCart")
    public int deleteCart(@RequestParam("u_id") int u_id,@RequestParam("key") String  key[]){
        cartService.cleanCart(u_id,key);
        return 1;
    }

    @ResponseBody
    @ApiOperation("删除部分产品")
    @DeleteMapping("/partCart")
    public int partCart(@RequestParam("u_id") int u_id,@RequestParam("key") String  key[]){
        cartService.partCart(u_id,key);
        return 1;
    }



}
