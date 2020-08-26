package cn.icepan.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/***
 *@Author icepan
 *@Date 2020/8/26 下午2:54
 *@Description
 *
 ***/
@Configuration
@PropertySource(value = "classpath:application-es.yaml")
public class ElasticSearchConfig {

    @Value("${es.host}")
    private String host;

    @Value("${es.port}")
    private Integer port;


    @Bean("EsClient")
    public RestHighLevelClient EsClient(){
        return new RestHighLevelClient(RestClient.builder(
                new HttpHost(host, port)
        ));
    }

}
