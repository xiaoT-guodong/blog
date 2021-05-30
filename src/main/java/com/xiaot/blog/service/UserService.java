package com.xiaot.blog.service;

import com.xiaot.blog.vo.UserVo;

/**
 * @author xiaoT
 */
public interface UserService {

    /**
     * 查找用户
     * @param username 用户名
     * @param password 密码
     * @return UserVo
     */
    UserVo findUser(String username, String password);

}
