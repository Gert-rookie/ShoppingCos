package top.fotg.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.fotg.entity.Cosmetics;
import top.fotg.entity.Perfume;
import top.fotg.entity.SkinCare;
import top.fotg.vo.SingerCom;

/**
 * 商品接口
 */
@Repository(value = "goodsDao")
public interface GoodsDao {
    /**
     * 商品详情查询接口（针对香水表）
     * @return
     */
    public Perfume querySingerComXS(@Param("id")int id);

    /**
     * 商品详情查询接口(针对护肤表)
      * @param id
     * @return
     */
public SkinCare querySingerComSkin(@Param("id") int id);

    /**
     * 彩妆详情页
     * @param id
     * @return
     */
    public Cosmetics querySingerComCos(@Param("id") int id);
}
