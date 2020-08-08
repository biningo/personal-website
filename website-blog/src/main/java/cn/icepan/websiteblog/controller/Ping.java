package cn.icepan.websiteblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("website-blog-ping")
@RequestMapping("/blog")
public class Ping {

    @GetMapping("/ping")
    public String ping(){
        return "blog";
    }

}
