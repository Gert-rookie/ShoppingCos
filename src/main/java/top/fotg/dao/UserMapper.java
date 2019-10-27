package top.fotg.dao;


import org.springframework.stereotype.Repository;
import top.fotg.entity.user.Address;
import top.fotg.entity.user.User;

/**
 * Created by jake on 2019/4/9.
 */
@Repository(value = "usersMapper")
public interface UserMapper {

    User findByUsername(String user_phone);

    User findUserById(String userId);

    void insertUser(User user);

    void updatetUser(User user);

    User findByPassword(String u_pwd);

    void updatepassword(User user);

    void deladdr(String u_id);

    void saveaddr(Address useraddr);

    Address findByAddressMoren(String a_moren);

    void updateAddressMoren(Address useraddr);

    void updateAddr(Address useraddr);

    User findByUserPhone(User user);
}
