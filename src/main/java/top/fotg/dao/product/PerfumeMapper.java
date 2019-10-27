package top.fotg.dao.product;

import org.springframework.stereotype.Repository;
import top.fotg.entity.ProductPerfume;

import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 香水dao
 */

@Repository(value = "perfumeMapper")
public interface PerfumeMapper {
    List<ProductPerfume> queryPerfume();
}
