package top.fotg.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;
import top.fotg.entity.user.User;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by lwc on 2019/5/8.
 */
@Service
public class TokenService {

    public String getToken(User user) {

        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(calendar.MINUTE,60);
        date = calendar.getTime();

        String token="";
        token= JWT.create().withAudience(Integer.toString(user.getU_id())).withIssuedAt(new Date()).withExpiresAt(date)
                .sign(Algorithm.HMAC256(user.getU_pwd()));
        return token;
    }
}
