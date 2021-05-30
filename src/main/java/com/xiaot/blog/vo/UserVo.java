package com.xiaot.blog.vo;

import com.xiaot.blog.po.UserPo;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiaoT
 */
@Data
@Builder
public class UserVo {

    private Integer id;

    /**
     * 用户名
     */
    private String name;

    public static UserVo from(UserPo userPo) {
        return UserVo.builder()
                .id(userPo.getId())
                .name(userPo.getName())
                .build();
    }

}
