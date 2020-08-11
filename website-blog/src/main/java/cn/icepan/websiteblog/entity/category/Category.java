package cn.icepan.websiteblog.entity.category;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/*/**
 *@Author icepan
 *@Date 2020/8/11 下午2:08
 *@Description
 *
 **/

@Data
@Document(collection = "category_collection")
public class Category {
    @Id
    private String id;
    @Field
    private String title;

}
