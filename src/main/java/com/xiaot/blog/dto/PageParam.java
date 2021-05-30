package com.xiaot.blog.dto;

import lombok.Data;

/**
 * @author xiaoT
 */
@Data
public class PageParam {

    /**
     * 第几页
     */
    private Integer pageNo;

    /**
     * 一页多少条
     */
    private Integer pageSize;

}
