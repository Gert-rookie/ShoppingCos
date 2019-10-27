package top.fotg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.fotg.service.OrderService;
import top.fotg.vo.OrderDetailList;
import top.fotg.vo.OrderInsertDetail;
import top.fotg.vo.OrderInsertReq;
import top.fotg.vo.OrderInsertRes;

import java.util.List;

/**
 * 订单接口
 */

@RequestMapping("/order")
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value="/queryOrderAll",method=RequestMethod.POST)
    @ResponseBody
    public int queryOrderAll(@RequestParam int u_id){
        return orderService.queryOrderAll(u_id);
    }

    @RequestMapping(value="/orderList",method = RequestMethod.POST)
    @ResponseBody
    public List<OrderDetailList> queryOrderList(@RequestParam int page, @RequestParam int u_id){
        return orderService.queryOrderList(page,u_id);
    }

    @RequestMapping(value="/insertOrder",method=RequestMethod.POST)
    @ResponseBody
    public OrderInsertRes insertOrder(@RequestBody OrderInsertReq orderInsertReq){
            return orderService.insertOrder(orderInsertReq);
    }
}
