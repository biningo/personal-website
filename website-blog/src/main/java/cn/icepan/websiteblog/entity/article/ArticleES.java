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
public class Article{
    protected String id;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date createAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date deleteAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date updateAt;
    private String title;
    private String content;
    private String category;
    private Integer views;
    private Integer likes;
}
