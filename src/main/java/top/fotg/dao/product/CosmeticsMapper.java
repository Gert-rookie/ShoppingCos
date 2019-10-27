package top.fotg.dao.product;

import org.springframework.stereotype.Repository;
import top.fotg.entity.ProductWithColor;

import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 香水dao
 */

@Repository(value = "cosmeticsMapper")
public interface CosmeticsMapper {
    List<ProductWithColor> queryCosmetics();
}
