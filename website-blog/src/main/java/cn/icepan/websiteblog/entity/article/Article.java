package cn.icepan.websiteblog.entity.article;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @Author icepan
 * @Date 2020/8/11
 * @Description
 **/
@Data
@Accessors(chain = true)
@Document
public class Article{
    @Id
    protected String id;
    @Field
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date createAt;
    @Field
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date deleteAt;
    @Field
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    protected Date updateAt;

    @Field
    private String title;
    @Field
    private String content;
    @Field
    private String category;
    @Field
    private Integer views;
    @Field
    private Integer likes;
}
