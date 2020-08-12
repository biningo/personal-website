package cn.icepan.websiteblog.entity.article.vo;

import cn.icepan.websiteblog.entity.article.Article;
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
    public Article toArticleEntity(){
        return new Article()
                .setId(this.getId())
                .setTitle(this.getTitle())
                .setCategory(this.getCategory())
                .setContent(this.getContent())
                .setCreateAt(this.getTime());
    }
    //Article => ArticleUploadVo
    public void toSelf(Article article){
        this.setId(article.getId());
    }

}
