package com.xiaot.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xiaot.blog.dao.UserDao;
import com.xiaot.blog.dictionary.Dictionary;
import com.xiaot.blog.po.UserPo;
import com.xiaot.blog.service.UserService;
import com.xiaot.blog.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xiaoT
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserVo findUser(String username, String password) {
        QueryWrapper<UserPo> query = Wrappers.query(new UserPo(username, password, Dictionary.UN_DELETE));
        UserPo userPo = userDao.selectOne(query);
        return userPo == null ? null : UserVo.from(userPo);
    }

}
