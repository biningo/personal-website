package cn.icepan.website.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("website-ping")
public class Ping {
    @GetMapping("/ping")
    public String ping(){
        return "website";
    }
}
