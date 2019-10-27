package top.fotg.util;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 创建订单号工具
 */
@Repository
public class NumberUtil {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public final static String DATE_PATTERN = "yyyy-MM-dd";
    public long creatOrderNumber(){
        int type=1;                     //创建订单标识
         String localDate=LocalDate.now().toString();
       String str="";
       for(String res:localDate.split("-")){
           str+=res;
       }
        int random=(int)(Math.random()*10+1);               //1-10的生成随机数
        String key="order:"+str;
        String orderNumber=redisTemplate.opsForValue().increment(key,random).toString();              //获取序列号
        while(null!=orderNumber&&orderNumber.length()<8){
            orderNumber="0"+orderNumber;
        }
        String result=type+str+orderNumber;
        return Long.parseLong(result);
    }
   /* public static void main(String args[]) {
      LocalDate localDate=LocalDate.now();
       String localDate=LocalDate.now().toString();
       String str="";
       for(String res:localDate.split("-")){
           str+=res;
       }

   }*/

   public void testRedis(){

   }
}
