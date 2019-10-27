package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.fotg.dao.product.SkinCareMapper;
import top.fotg.entity.ProductSkinCare;
import top.fotg.service.SkinCareServer;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by LHX on 2019/5/7.
 */

@Service(value = "skinCareServer")
public class SkinCareServerImpl implements SkinCareServer{
    @Resource(name = "skinCareMapper")
    private SkinCareMapper skinCareMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    private List<ProductSkinCare> skinCareList;


    @Override
    public List<ProductSkinCare> querySkinCare() {
        skinCareList=skinCareMapper.querySkinCare();
        redisTemplate.opsForList().rightPushAll("skinCareList",skinCareList);//向redis里存入数据和设置缓存时间(5分钟)
        return skinCareList;
    }


}
