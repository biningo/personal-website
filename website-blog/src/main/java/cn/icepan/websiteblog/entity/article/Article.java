package cn.icepan.websiteblog.entity.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *@Author icepan
 *@Date 2020/8/18 上午11:27
 *@Description
 *
 ***/


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {

    private Long id;
    private String title;

}
