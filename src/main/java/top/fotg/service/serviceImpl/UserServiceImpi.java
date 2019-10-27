package top.fotg.service.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fotg.entity.user.Address;
import top.fotg.entity.user.User;
import top.fotg.service.UserService;
import top.fotg.dao.UserMapper;

/**
 * Created by jake on 2018/11/8.
 */

@Service(value = "userServer")
public class UserServiceImpi implements UserService {

    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUser_phone());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public User findByPassword(String u_pwd) {
        return userMapper.findByPassword(u_pwd);
    }

    @Override
    public Address findByAddressMoren(String a_moren) {
        return userMapper.findByAddressMoren(a_moren);
    }

    @Override
    public void updateAddressMoren(Address useraddr) {
        userMapper.updateAddressMoren(useraddr);
    }

    @Override
    public void saveaddr(Address useraddr) {
        userMapper.saveaddr(useraddr);
    }

    @Override
    public void deladdr(String u_id) {
        userMapper.deladdr(u_id);
    }

    @Override
    public User findByUserPhone(User user) {
        return userMapper.findByUserPhone(user);
    }

    @Override
    public void updatepassword(User user) {
        userMapper.updatepassword(user);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updatetUser(User user) {
        userMapper.updatetUser(user);
    }

    @Override
    public void updateAddr(Address useraddr) {
        userMapper.updateAddr(useraddr);
    }
}
