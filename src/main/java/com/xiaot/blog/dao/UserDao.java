package com.xiaot.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaot.blog.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaoT
 */
@Mapper
public interface UserDao extends BaseMapper<UserPo> {
}
