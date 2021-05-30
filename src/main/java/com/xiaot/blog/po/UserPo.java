package com.xiaot.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaoT
 */
@Data
@NoArgsConstructor
@TableName("base_user")
public class UserPo {

    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否删除
     */
    private Integer isDelete;

    public UserPo(String name, String password, Integer isDelete) {
        this.name = name;
        this.password = password;
        this.isDelete = isDelete;
    }

}
