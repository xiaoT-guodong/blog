package com.xiaot.blog.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaot.blog.dto.PageParam;
import com.xiaot.blog.vo.ArticleVo;

/**
 * @author xiaoT
 */
public interface ArticleService {

    /**
     * 文章列表
     * @param pageParam 分页
     * @return List<ArticleVo>
     */
    Page<ArticleVo> list(PageParam pageParam);

}
