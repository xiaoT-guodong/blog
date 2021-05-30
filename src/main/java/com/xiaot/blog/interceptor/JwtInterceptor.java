package com.xiaot.blog.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiaot.blog.util.Jwt;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static com.xiaot.blog.util.Result.result;

/**
 * @author xiaoT
 */
public class JwtInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        try {
            request.setAttribute("user", Jwt.verity(token));
            return true;
        } catch (Exception e) {
            response.setContentType("application/json;charset=UTF-8");
            Map<String, Object> result = result(400, "token失效");
            response.getWriter().println(new ObjectMapper().writeValueAsString(result));
        }
        return false;
    }

}
