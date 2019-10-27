package top.fotg.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import com.auth0.jwt.JWT;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.fotg.entity.user.User;
import top.fotg.service.UserService;
import top.fotg.util.PhoneDx;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by jake on 2018/11/8.
 */

@RequestMapping(value = "/user")
@RestController
//@Api("用户信息管理")
public class RegisterController {

    @Autowired
    UserService userService;

    /**
     * 手机号码是否存在校验
     * @param user
     * @return
     */
    @PostMapping("/phoneverif")
    public String phoneverifapi(@RequestBody User user){
        System.out.print(user.getUser_phone());
        User newuser = userService.findByUsername(user);
        String msg = "";
        if (newuser == null){
            msg = "yes";
        }else {
            msg = "no";
        }
        return msg;
    }

    /**
     * 获取验证码
     * @param user_phone
     * @param session
     * @throws ClientException
     */
    @PostMapping("/sendphonecode")
    public void phonecode(@RequestParam("user_phone") String user_phone, HttpSession session) throws ClientException {
        int code = PhoneDx.getPhoneDx(user_phone);
        session.setAttribute("code",  code + "");
    }


    /**
     * 验证手机验证码
     * @param re_code
     * @param session
     * @return
     */
    @PostMapping("/phonecodverify")
    public String phonecodverifyapi(@RequestParam("re_code") String re_code, HttpSession session){
        String code = (String)session.getAttribute("code");
        String msg = "";
        if (re_code == null){
            msg = "null";
        }else if (re_code.equals(code)) {
            msg = "yes";
        } else {
            msg = "no";
        }
        return msg;
    }

    /**
     * 注册
     * @param user
     */
    @PostMapping("/register")
    public void register(@RequestBody User user){
        user.setU_status("1");
        userService.insertUser(user);
    }
}








