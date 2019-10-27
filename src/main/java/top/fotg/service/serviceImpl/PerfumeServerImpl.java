package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.fotg.entity.ProductPerfume;
import top.fotg.service.PerfumeServer;
import top.fotg.dao.product.PerfumeMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by LHX on 2019/5/7.
 */

@Service(value = "perfumeServer")
public class PerfumeServerImpl implements PerfumeServer{
    @Resource(name = "perfumeMapper")
    private PerfumeMapper perfumeMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    private List<ProductPerfume> perfumeList;

    @Override
    public List<ProductPerfume> queryPerfume() {
        perfumeList=perfumeMapper.queryPerfume();
        redisTemplate.opsForList().rightPushAll("perfumeList",perfumeList);
        return perfumeList;
    }

}
