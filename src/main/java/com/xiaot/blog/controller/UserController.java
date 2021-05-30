package com.xiaot.blog.controller;

import com.xiaot.blog.service.UserService;
import com.xiaot.blog.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.xiaot.blog.util.Jwt.getToken;
import static com.xiaot.blog.util.Result.result;

/**
 * @author xiaoT
 */
@Api(tags = "操作员")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public Map<String, Object> login(@ApiParam("用户名") String username, @ApiParam("密码") String password) {
        UserVo user = userService.findUser(username, password);
        if (user == null) {
            return result("用户名或密码错误");
        }
        return result(user, getToken(user));
    }
}
