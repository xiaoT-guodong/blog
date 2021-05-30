package com.xiaot.blog.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author xiaoT
 */
@Data
@TableName("article_article")
public class ArticlePo {

    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 是否删除
     */
    private Integer isDelete;

}
