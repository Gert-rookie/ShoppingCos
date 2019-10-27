package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.fotg.entity.ProductWithColor;
import top.fotg.service.CosmeticsServer;
import top.fotg.dao.product.CosmeticsMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by LHX on 2019/5/7.
 */

@Service(value = "cosmeticsServer")
public class CosmeticsServerImpl implements CosmeticsServer{
    @Resource(name = "cosmeticsMapper")
    private CosmeticsMapper cosmeticsMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    private List<ProductWithColor> cosmeticsList;


    @Override
    public List<ProductWithColor> queryCosmetics() {
        cosmeticsList=cosmeticsMapper.queryCosmetics();
        redisTemplate.opsForList().rightPushAll("cosmeticsList",cosmeticsList);//向redis里存入数据和设置缓存时间(5分钟)
        return cosmeticsList;
    }


}
