package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fotg.service.GoodsService;
import top.fotg.dao.GoodsDao;
import top.fotg.entity.Cosmetics;
import top.fotg.entity.PerContainer;
import top.fotg.entity.Perfume;
import top.fotg.entity.SkinCare;
import top.fotg.vo.Color;
import top.fotg.vo.PerContainerRes;
import top.fotg.vo.SingerCom;
import top.fotg.vo.Singercosmetics;

import java.util.ArrayList;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public SingerCom querySingerCom(int pro_id, int id) throws Exception {
        if(pro_id==3){                  //香水类
            Perfume perfume=goodsDao.querySingerComXS(id);
            List<PerContainerRes> capacity_arr=new ArrayList<>();
            for(int i=0;i<perfume.getList().size();i++){
                PerContainer perContainer=perfume.getList().get(i);
                capacity_arr.add(i,new PerContainerRes(perContainer.getCapacity(),perContainer.getPrice(),perContainer.getRestnumber()));
            }
            SingerCom singerCom=new SingerCom(perfume.getName(),perfume.getEngname(),capacity_arr,perfume.getPicture());
        return singerCom;}
        else if(pro_id==2){
        SkinCare skinCare=goodsDao.querySingerComSkin(id);
        List<PerContainerRes> list=new ArrayList<>();
        list.add(0,new PerContainerRes(skinCare.getCapacity(),skinCare.getPrice(),skinCare.getNumber()));
        SingerCom singerCom=new SingerCom(skinCare.getName(),skinCare.getEngname(),list,skinCare.getPicture());
        return  singerCom;
    }
                throw new Exception("pro_id不对");

    }

    @Override
    public Singercosmetics querySingerCZ(int id) {
        Cosmetics cosmetics=goodsDao.querySingerComCos(id);
        Singercosmetics singercosmetics=new Singercosmetics(cosmetics.getName(),cosmetics.getEngname(),cosmetics.getList(),cosmetics.getPicture(),cosmetics.getPrice());
        return singercosmetics;
    }
}
