package cn.icepan.websiteblog.entity.article.vo;

import lombok.Data;

/***
 *@Author icepan
 *@Date 2020/8/11 下午2:13
 *@Description upload article vo
 *
 ***/

@Data
public class ArticleUploadVO extends ArticleBaseVO {
    private String content;
}
