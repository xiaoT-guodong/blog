package com.xiaot.blog.vo;

import com.xiaot.blog.po.ArticlePo;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiaoT
 */
@Data
@Builder
public class ArticleVo {

    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    public static ArticleVo from(ArticlePo articlePo) {
        return ArticleVo.builder()
                .id(articlePo.getId())
                .title(articlePo.getTitle())
                .content(articlePo.getContent())
                .build();

    }

}
