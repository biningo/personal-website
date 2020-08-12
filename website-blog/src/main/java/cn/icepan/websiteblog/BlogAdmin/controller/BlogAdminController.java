package cn.icepan.websiteblog.BlogAdmin.controller;

import cn.icepan.websiteblog.entity.article.vo.ArticleUploadVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import response.Result;
/*/**
 * @Author icepan
 * @Description 博客后台管理相关请求的Controller
 * @Date 2020-08-09
 **/

@RestController
@RequestMapping("/admin/blog")
public class BlogAdminController {


    @Autowired
    MongoTemplate mongoTemplate;

    @PostMapping("/upload")
    public Result upload(@RequestBody ArticleUploadVO article){
        System.out.println(article);

        if(article.getId()!=null){
            article.toSelf(mongoTemplate.save(article.toArticleEntity()));
        }
        Result result = Result.OK();
        result.put("article",article);
        return result;
    }


}
