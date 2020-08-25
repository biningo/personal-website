package cn.icepan.websiteblog.entity.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/*/**
 * @Author icepan
 * @Date 2020/8/11
 * @Description Article MongoDB Collection
 **/
@Data
@Accessors(chain = true)
public class ArticleES {
    protected Long id;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    protected Date uploadTime;
    private String title;
    private String content;
    private String category;
    private Integer views;
    private Integer likes;
}
