package top.fotg.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.fotg.bto.UpdateUserBto;
import top.fotg.config.token.UserLoginToken;
import top.fotg.entity.user.Address;
import top.fotg.entity.user.User;
import top.fotg.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lwc on 2019/5/10.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 信息修改
     * @param user
     */
    @PostMapping("/userinfoupdate")
    public void userinfoupdateapi(@RequestBody User user) throws Exception{
//        System.out.print(userBto.toString());
//        User user = new User();
//        String date = userBto.getYear() + "-" + userBto.getMonth() + "-" + userBto.getDay();
//        System.out.print(date);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date1 = sdf.parse(date);
//        user.setU_birth(date);
//        user.setU_email(userBto.getU_email());
//        user.setU_lastname(userBto.getU_lastname());
//        user.setU_phone(userBto.getU_phone());
//        user.setU_sex(userBto.getU_sex());
//        user.setU_id(Integer.parseInt(userBto.getU_id()));
//        System.out.print(user.toString());
        System.out.print(user.toString());
        userService.updatetUser(user);

    }

    /**
     * 旧密码校验
     * @param u_pwd
     * @return
     */
    @PostMapping("/pwdoldverify")
    public String pwdoldverifyapi(@RequestParam("u_pwd") String u_pwd){
        System.out.print(u_pwd);
        User user = userService.findByPassword(u_pwd);
        String msg = "";

        if (user == null){
            msg = "no";
        }else {
            msg = "yes";
        }
            return msg;
    }


    /**
     * 密码修改
     * @param user
     */
    @PostMapping("/user_updatepwd")
    public void user_updatepwdapi(@RequestBody User user){
        System.out.print(user.toString());
            userService.updatepassword(user);
    }

    /**
     * 删除收货地址
     * @param a_id
     */
    @PostMapping("/address/del")
    public void address_delapi(@RequestParam("a_id") String a_id){
            userService.deladdr(a_id);
    }

    /**
     * 增加收货地址
     * @param useraddr
     */
    @UserLoginToken
    @PostMapping("/address/add")
    public void address_addapi(@RequestBody Address useraddr){
        if (useraddr.getA_moren().equals("1")){
            Address addr = userService.findByAddressMoren(useraddr.getA_moren());
            if(addr != null){
                addr.setA_moren("0");
                userService.updateAddressMoren(addr);
            }
            userService.saveaddr(useraddr);

        }else {
            userService.saveaddr(useraddr);

        }
    }

    /**
     * 修改地址信息
     * @param useraddr
     */
    @PostMapping("/address/upd")
    public void userinfoupdateapi(@RequestBody Address useraddr){
        if (useraddr.getA_moren().equals("1")){
            Address addr = userService.findByAddressMoren(useraddr.getA_moren());
            if(addr != null){
                addr.setA_moren("0");
                userService.updateAddressMoren(addr);
            }
            userService.updateAddr(useraddr);

        }else {
            userService.updateAddr(useraddr);
        }
    }

    @PostMapping("/morenaddr")
    public void morenaddrapi(@RequestBody Address useraddr){
            Address addr = userService.findByAddressMoren(useraddr.getA_moren());
            if(addr != null){
                addr.setA_moren("0");
                userService.updateAddressMoren(addr);
            }
         userService.updateAddressMoren(useraddr);
        }


}
