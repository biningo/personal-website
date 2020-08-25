package cn.icepan.websiteblog.entity.article.vo;

import cn.icepan.websiteblog.entity.article.es.ArticleES;
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

    //ArticleUploadVo => Article
    public ArticleES toArticleEntity(){
        return new ArticleES()
                .setId(this.getId())
                .setTitle(this.getTitle())
                .setCategory(this.getCategory())
                .setContent(this.getContent())
                .setUploadTime(this.getUploadTime());
    }
    //Article => ArticleUploadVo
    public void toSelf(ArticleES article){
        this.setId(article.getId());
    }

}
