package top.fotg.service;

import top.fotg.vo.SingerCom;
import top.fotg.vo.Singercosmetics;

/**
 * 商品详情
 */
public interface GoodsService {
    public SingerCom querySingerCom(int pro_id,int id) throws Exception;
    public Singercosmetics querySingerCZ(int id);
}
