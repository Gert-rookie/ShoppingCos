package top.fotg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.fotg.service.GoodsService;
import top.fotg.util.Result;
import top.fotg.util.ResultUtil;
import top.fotg.vo.GoodsDetailReq;
import top.fotg.vo.SingerCom;
import top.fotg.vo.Singercosmetics;

/**
 * 商品页
 */
@RequestMapping("/Com")
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping("/querySingerCom")
    @ResponseBody
    public Result<SingerCom> querySingerCom(@RequestBody GoodsDetailReq goodsDetailReq) throws Exception {
            return ResultUtil.success(goodsService.querySingerCom(goodsDetailReq.getPro_id(),goodsDetailReq.getId()));
    }
    @PostMapping("/querySingerCZ")
    @ResponseBody
    public Result<Singercosmetics> querySingerCZ(@RequestBody GoodsDetailReq goodsDetailReq) throws Exception {
        return ResultUtil.success(goodsService.querySingerCZ(goodsDetailReq.getId()));
    }
}
