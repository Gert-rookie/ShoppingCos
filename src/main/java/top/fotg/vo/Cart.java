package top.fotg.vo;



import java.io.Serializable;


/**
 * @Author jake
 * @Date 2019/5/8 22:34
 * @feature 购物车实体类
 */
    public class Cart implements Serializable {  //单个产品
        private static final long serialVersionUID = 6616085317152000522L;
        private int u_id;  //用户id
        private int id;    //产品id
        private int pro_id;  //类型id
        private String product_id; //组合生成的唯一产品标识
        private int capacity;  //容量
        private String color_name; //彩妆类色号名
        private String picture; //产品图片
        private String name;
        private float price; //价格
        private int number; //总数
        private float sum_price;  //总价格
        private String notice;


        public int getU_id() {
            return u_id;
        }

        public void setU_id(int u_id) {
            this.u_id = u_id;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public int getPro_id() {
            return pro_id;
        }

        public void setPro_id(int pro_id) {
            this.pro_id = pro_id;
        }


        public String getProduct_id() {
            return product_id;
        }

        public void setProduct_id(String product_id) {
            this.product_id = product_id;
        }


        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }


        public String getColor_name() {
            return color_name;
        }

        public void setColor_name(String color_name) {
            this.color_name = color_name;
        }


        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public float getSum_price() {
            return sum_price;
        }

        public void setSum_price(float sum_price) {
            this.sum_price = sum_price;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }


        @Override
        public String toString() {
            return "Cart{" +
                    "u_id=" + u_id +
                    ", pro_id=" + pro_id +
                    ", capacity=" + capacity +
                    ", picture='" + picture + '\'' +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    ", number=" + number +
                    ", sum_price=" + sum_price +
                    ", notice='" + notice + '\'' +
                    '}';
        }

    }

