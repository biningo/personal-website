package cn.icepan.websiteblog.entity.article.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/***
 *@Author icepan
 *@Date 2020/8/11 下午2:15
 *@Description
 *
 ***/
@Data
public class ArticleBaseVO {
    private String id;
    private String title;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private String updateTime;

    private String category;
}
