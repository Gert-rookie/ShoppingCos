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
import top.fotg.entity.ProductPerfume;
import top.fotg.service.PerfumeServer;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 香水controller
 */

@RequestMapping(value = "/perfume")
@Controller(value = "perfumeController")
@Api("香水产品管理")
public class PerfumeController {
    @Resource(name = "perfumeServer")
    private PerfumeServer perfumeServer;
    @Autowired
    private RedisTemplate redisTemplate;


    @ApiOperation("获取香水列表")
    @PostMapping(value = "/perfumeList")
    @ResponseBody
    private Object queryPerfume(){

        List<ProductPerfume> perfumeList=redisTemplate.opsForList().range("perfumeList",0,-1);
        if (perfumeList.size()==0) {
            perfumeList = perfumeServer.queryPerfume();
        }
        return perfumeList;
    }
}
