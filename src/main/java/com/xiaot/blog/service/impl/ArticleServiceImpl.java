package com.xiaot.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaot.blog.dao.ArticleDao;
import com.xiaot.blog.dto.PageParam;
import com.xiaot.blog.dictionary.Dictionary;
import com.xiaot.blog.po.ArticlePo;
import com.xiaot.blog.service.ArticleService;
import com.xiaot.blog.vo.ArticleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.stream.Collectors;

/**
 * @author xiaoT
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleDao articleDao;

    @Override
    public Page<ArticleVo> list(PageParam pageParam) {
        ArticlePo articlePo = new ArticlePo();
        articlePo.setIsDelete(Dictionary.UN_DELETE);
        QueryWrapper<ArticlePo> query = Wrappers.query(articlePo);
        Page<ArticlePo> page = articleDao.selectPage(new Page<>(pageParam.getPageNo(), pageParam.getPageSize()), query);
        Page<ArticleVo> voPage = new Page<>();
        voPage.setTotal(page.getTotal());
        voPage.setRecords(page.getRecords().stream().map(ArticleVo::from).collect(Collectors.toList()));
        return voPage;
    }

}
