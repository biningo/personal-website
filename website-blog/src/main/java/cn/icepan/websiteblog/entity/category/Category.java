package cn.icepan.websiteblog.entity.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


/*/**
 *@Author icepan
 *@Date 2020/8/11 下午2:08
 *@Description
 *
 **/

@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String id;
    private String title;
}
