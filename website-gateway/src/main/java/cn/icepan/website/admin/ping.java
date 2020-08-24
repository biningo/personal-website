package cn.icepan.website.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import response.Result;

/***
 *@Author icepan
 *@Date 2020/8/24 下午3:10
 *@Description
 *
 ***/

@RestController
@RequestMapping("admin")
public class ping {

    @GetMapping("/ping")
    public Result Ping(){
        return Result.SUCCESS("Pong");
    }


}
