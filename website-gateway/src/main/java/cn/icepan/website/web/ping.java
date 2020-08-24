package cn.icepan.website.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import response.Result;

@RestController("website-ping")
public class ping {
    @GetMapping("/ping")
    public Result Ping(){
        return Result.SUCCESS("website-gateway");
    }
}
