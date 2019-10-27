package top.fotg.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.fotg.entity.user.User;
import top.fotg.service.TokenService;
import top.fotg.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by lwc on 2019/5/8.
 */

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @Autowired
    StringRedisTemplate redisTemplate;

    /**
     * 登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Object login(@RequestBody User user){
        System.out.print(user.getUser_phone());
        JSONObject jsonObject=new JSONObject();
        User userForBasenoe = userService.findByUserPhone(user);
        User userForBasetwo = userService.findByUsername(user);

        if(userForBasenoe == null){
            jsonObject.put("message","error");
            return jsonObject;
        }else {
            if (!userForBasenoe.getU_pwd().equals(user.getU_pwd())){
                jsonObject.put("message","pwd");
                return jsonObject;
            }else {
                String token = tokenService.getToken(userForBasenoe);

                if(userForBasenoe.getU_birth() != null){
                    Calendar calendar = new GregorianCalendar();
                    Date date = new Date();
                    calendar.setTime(userForBasenoe.getU_birth());
                    calendar.add(calendar.DAY_OF_MONTH,1);
                    userForBasenoe.setU_birth(calendar.getTime());
                }

                if (userForBasetwo.getAddress() != null) {
                    jsonObject.put("user", userForBasetwo);
                    redisTemplate.opsForValue().set("userinfo", userForBasetwo.toString());
                    System.out.print("userForBasetwo" + userForBasetwo.toString());
                }else {
                    System.out.print(userForBasenoe.toString());
                    jsonObject.put("user", userForBasenoe);
                    redisTemplate.opsForValue().set("userinfo", userForBasenoe.toString());
                }

                jsonObject.put("token", token);
                return jsonObject;
            }
        }
    }
}
