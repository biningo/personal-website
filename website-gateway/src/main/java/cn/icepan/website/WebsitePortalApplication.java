package cn.icepan.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//注意要添加扫描的包 这样就能扫描到子模块的包了
@SpringBootApplication(scanBasePackages = {"cn.icepan"})
public class WebsitePortalApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebsitePortalApplication.class, args);
    }
}
