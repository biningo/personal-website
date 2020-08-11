package cn.icepan.websiteblog.entity.category.vo;

import cn.icepan.websiteblog.entity.article.vo.ArticleListItemVO;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;

/*/**
 *@Author icepan
 *@Date 2020/8/11 下午2:02
 *@Description
 *
 **/


@Data
public class CategoryVO {
    private String id;
    private String title;
    private List<String> times;
    private List<ArticleListItemVO> articleVOList;
}
