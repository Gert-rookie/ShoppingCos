package top.fotg.service;


import top.fotg.entity.user.Address;
import top.fotg.entity.user.User;

/**
 * Created by jake on 2018/11/8.
 */
public interface UserService {

    //根据手机号码查用户信息
    User findByUsername(User user);

    //根据id查用户信息
    User findUserById(String userId);

    //注册
    void insertUser(User user);

    //信息修改
    void updatetUser(User user);

    //验证旧密码
    User findByPassword(String u_pwd);

    //密码修改
    void updatepassword(User user);

    //删除收货地址
    void deladdr(String u_id);

    //增加收货地址
    void saveaddr(Address useraddr);

    //查询地址是否默认
    Address findByAddressMoren(String a_moren);

    //修改成为不是默认
    void updateAddressMoren(Address useraddr);

    //修改地址信息
    void updateAddr(Address useraddr);

    User findByUserPhone(User user);
}
