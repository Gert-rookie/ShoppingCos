package top.fotg.controller.product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.fotg.entity.ProductWithColor;
import top.fotg.service.CosmeticsServer;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 香水controller
 */

@RequestMapping(value = "/cosmetics")
@Controller(value = "cosmeticsController")
@Api("彩妆查询")
public class CosmeticsController {
    @Resource(name = "cosmeticsServer")
    private CosmeticsServer cosmeticsServer;
    @Autowired
    private RedisTemplate redisTemplate;

    @ApiOperation("获取彩妆列表")
    @PostMapping(value = "/cosmeticsList")
    @ResponseBody
    private Object queryCosmetics(){

        List<ProductWithColor> cosmeticsList=redisTemplate.opsForList().range("cosmeticsList",0,-1);
        if(cosmeticsList.size()==0){
            cosmeticsList=cosmeticsServer.queryCosmetics();
        }
        return cosmeticsList;

    }
}
