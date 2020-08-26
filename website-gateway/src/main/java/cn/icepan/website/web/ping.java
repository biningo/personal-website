package cn.icepan.website.web;


import cn.icepan.service.es.EsIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import response.Result;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController("webping")
@RequestMapping("web")
public class ping {

    @Resource
    EsIndexService esIndexService;

    @Value("${es.host}")
    private String index;

    @GetMapping("/ping")
    public Result Ping(){
        return Result.SUCCESS(index);
    }
}
