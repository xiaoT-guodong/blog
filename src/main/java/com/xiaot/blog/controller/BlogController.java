package com.xiaot.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaot.blog.dto.PageParam;
import com.xiaot.blog.service.ArticleService;
import com.xiaot.blog.vo.ArticleVo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.xiaot.blog.util.Result.result;

/**
 * @author xiaoT
 */
@Api(tags = "博客文章")
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    ArticleService articleService;

    @GetMapping
    public Map<String, Object> list(PageParam pageParam) {
        Page<ArticleVo> list = articleService.list(pageParam);
        return result(list.getTotal(), list.getRecords());
    }

}
