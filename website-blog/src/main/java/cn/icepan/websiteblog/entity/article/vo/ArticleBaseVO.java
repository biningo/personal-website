package cn.icepan.websiteblog.entity.article.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

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
    private Date time;

    private String category;
}
