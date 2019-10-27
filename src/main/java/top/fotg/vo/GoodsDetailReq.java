package top.fotg.vo;

/**
 * 商品详情页查询参数
 */
public class GoodsDetailReq {
    private int pro_id;                         //产品类型
    private int id;                             //商品ID

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
