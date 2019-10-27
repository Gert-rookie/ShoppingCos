package top.fotg.controller.product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.fotg.entity.ProductSkinCare;
import top.fotg.service.SkinCareServer;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 护肤controller
 */

@RequestMapping(value = "/skinCare")
@Controller(value = "skinCareController")
@Api("护肤产品管理")
public class SkinCareController {
    @Resource(name = "skinCareServer")
    private SkinCareServer skinCareServer;
    @Autowired
    private RedisTemplate redisTemplate;



    @ApiOperation("获取护肤列表")
    @PostMapping(value = "/skinCareList")
    @ResponseBody
    private Object querySkinCare(){
        List<ProductSkinCare> skinCareList =redisTemplate.opsForList().range("skinCareList",0,-1);
        if (skinCareList.size()==0) {
            skinCareList = skinCareServer.querySkinCare();
        }
        return skinCareList;
    }
}
