package cn.icepan.websiteblog.service.impl;

import cn.icepan.websiteblog.entity.article.vo.ArticleListItemVO;
import cn.icepan.websiteblog.entity.article.vo.ArticleUploadVO;

import java.util.List;

public interface ArticleServiceImpl {

    //----------------------------------query------------------------------
    List<ArticleListItemVO> GetAll(int Page);

    List<ArticleListItemVO> GetByID(int ID);

    List<ArticleListItemVO> GetByCategory(String category,int Page);

    //by time
    List<ArticleListItemVO> GetByTime(String year,int Page);

    List<ArticleListItemVO> GetByTime(String year, String month,int Page);

    List<ArticleListItemVO> GetByTime(String year, String month, String day,int Page);


    //----------------------------------create|update-------------------------------
    Boolean Uplaod(ArticleUploadVO articleUploadVO);


    //----------------------------------delete--------------------------------
    Boolean DelByID(Integer id);

    Boolean DelByCategory(String category);

    //by time
    List<ArticleListItemVO> DelByTime(String year);

    List<ArticleListItemVO> DelByTime(String year, String month);

    List<ArticleListItemVO> DelByTime(String year, String month, String day);


}
