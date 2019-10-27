package top.fotg.vo;

/**
 * 创建订单参数，订单详情
 */
public class OrderInsertDetail {
    private long orderType;                                                           //商品类型（根据不同类型查不同产品表）
    private long orderId;                                                             //商品ID
    private double goodsMoney;                                                        //商品购买时的金额
    private long goodsNumber;                                                         //商品数量
    private String goodsDetail;                                                          //商品名称
    private String goodsDetail2;                                                        //商品规格
    private String goodsImg;                                                            //商品图片

    public long getOrderType() {
        return orderType;
    }

    public void setOrderType(long orderType) {
        this.orderType = orderType;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(double goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public long getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(long goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsDetail2() {
        return goodsDetail2;
    }

    public void setGoodsDetail2(String goodsDetail2) {
        this.goodsDetail2 = goodsDetail2;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public OrderInsertDetail() {
    }

    public OrderInsertDetail(long orderType, long orderId, double goodsMoney, long goodsNumber, String goodsDetail, String goodsDetail2, String goodsImg) {
        this.orderType = orderType;
        this.orderId = orderId;
        this.goodsMoney = goodsMoney;
        this.goodsNumber = goodsNumber;
        this.goodsDetail = goodsDetail;
        this.goodsDetail2 = goodsDetail2;
        this.goodsImg = goodsImg;
    }
}
