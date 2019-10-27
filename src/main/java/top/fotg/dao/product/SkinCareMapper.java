package top.fotg.dao.product;

import org.springframework.stereotype.Repository;
import top.fotg.entity.ProductSkinCare;

import java.util.List;

/**
 * Created by LHX on 2019/5/7.
 * 护肤dao
 */

@Repository(value = "skinCareMapper")
public interface SkinCareMapper {
    List<ProductSkinCare> querySkinCare();
}
