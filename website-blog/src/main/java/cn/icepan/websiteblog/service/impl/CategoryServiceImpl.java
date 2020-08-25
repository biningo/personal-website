package cn.icepan.websiteblog.service.impl;

import cn.icepan.websiteblog.entity.category.vo.CategoryVo;

import java.util.List;

public interface CategoryServiceImpl {
    List<CategoryVo> GetAll(); //返回聚合统计信息
    List<String> SelectAll(); //只返回title

    List<CategoryVo> GetByTitle();

    Boolean UpdateTitle(String title);
}
