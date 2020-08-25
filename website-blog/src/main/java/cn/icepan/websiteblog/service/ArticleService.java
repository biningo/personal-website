package cn.icepan.websiteblog.service;

import cn.icepan.websiteblog.entity.article.vo.ArticleListItemVO;
import cn.icepan.websiteblog.entity.article.vo.ArticleUploadVO;
import cn.icepan.websiteblog.service.impl.ArticleServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 *@Author icepan
 *@Date 2020/8/25 下午7:29
 *@Description
 *
 ***/

@Service
public class ArticleService implements ArticleServiceImpl {

    @Override
    public List<ArticleListItemVO> GetAll(int Page) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> GetByID(int ID) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> GetByCategory(String category, int Page) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> GetByTime(String year, int Page) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> GetByTime(String year, String month, int Page) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> GetByTime(String year, String month, String day, int Page) {
        return null;
    }

    @Override
    public Boolean Uplaod(ArticleUploadVO articleUploadVO) {
        return null;
    }

    @Override
    public Boolean DelByID(Integer id) {
        return null;
    }

    @Override
    public Boolean DelByCategory(String category) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> DelByTime(String year) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> DelByTime(String year, String month) {
        return null;
    }

    @Override
    public List<ArticleListItemVO> DelByTime(String year, String month, String day) {
        return null;
    }
}
