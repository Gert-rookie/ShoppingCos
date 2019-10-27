package top.fotg.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

    //评论id
    private Integer com_id;
    //产品id
    private Integer cosmetic_id;
    //产品类型id
    private Integer pro_id;
    //用户id
    private Integer u_id;
    //内容
    private String content;
    //创建时间
    private String time;
    //点赞人数
    private Integer like_number;
    //评分
    private int star;
    //购买地
    private String buyon;
    //用户名字
    private String u_lastname;
    //产品类型
    private String pro_type;
    //产品名字
    private String name;

    public Integer getCom_id() {
        return com_id;
    }

    public void setCom_id(Integer com_id) {
        this.com_id = com_id;
    }

    public Integer getCosmetic_id() {
        return cosmetic_id;
    }

    public void setCosmetic_id(Integer cosmetic_id) {
        this.cosmetic_id = cosmetic_id;
    }

    public Integer getPro_id() {
        return pro_id;
    }

    public void setPro_id(Integer pro_id) {
        this.pro_id = pro_id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getLike_number() {
        return like_number;
    }

    public void setLike_number(Integer like_number) {
        this.like_number = like_number;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getBuyon() {
        return buyon;
    }

    public void setBuyon(String buyon) {
        this.buyon = buyon;
    }

    public String getU_lastname() {
        return u_lastname;
    }

    public void setU_lastname(String u_lastname) {
        this.u_lastname = u_lastname;
    }

    public String getPro_type() {
        return pro_type;
    }

    public void setPro_type(String pro_type) {
        this.pro_type = pro_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "com_id=" + com_id +
                ", cosmetic_id=" + cosmetic_id +
                ", pro_id=" + pro_id +
                ", u_id=" + u_id +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                ", like_number=" + like_number +
                ", star='" + star + '\'' +
                ", buyon='" + buyon + '\'' +
                ", u_lastname='" + u_lastname + '\'' +
                ", pro_type='" + pro_type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
