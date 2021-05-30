package com.xiaot.blog.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.xiaot.blog.vo.UserVo;

import java.util.Calendar;

/**
 * @author xiaoT
 */
public class Jwt {

    private static final String SECRET = "~!@#$%^&*()_+qaz";

    public static String getToken(UserVo user) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, 30);
        return JWT.create()
                .withExpiresAt(calendar.getTime())
                .withClaim("userId", user.getId())
                .withClaim("username", user.getName())
                .sign(Algorithm.HMAC256(SECRET));
    }

    public static DecodedJWT verity(String token) {
        return JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
    }

}
