package cn.icepan.service.es;

import cn.icepan.service.es.impl.EsIndexServiceImpl;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.common.settings.Settings;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/***
 *@Author icepan
 *@Date 2020/8/26 下午3:47
 *@Description
 *
 ***/

@Service
public class EsIndexService implements EsIndexServiceImpl {

    @Resource(name = "EsClient")
    RestHighLevelClient client;


    @Override
    public CreateIndexResponse Create(String index, Map<String, Object> settings, Map<String,Object>... types) {

        HashMap<String, Object> mappings = new HashMap<>();
        for (Map<String, Object> type : types) {
            mappings.put((String) type.get("title"),type);
        }

        CreateIndexRequest request = new CreateIndexRequest(index);
        request.settings(settings);
        request.mapping(mappings);

        CreateIndexResponse response=null;
        try {
            response = client.indices().create(request,RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public Boolean Exists(String index) {
        GetIndexRequest request = new GetIndexRequest(index);
        boolean exists = false;
        try {
            exists = client.indices().exists(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exists;
    }

    @Override
    public AcknowledgedResponse Delete(String index) {
        if(!Exists(index)){
            return null;
        }
        DeleteIndexRequest delRequest = new DeleteIndexRequest(index);
        AcknowledgedResponse response=null;
        try {
            response = client.indices().delete(delRequest, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public IndexResponse Index(String index) {
        IndexRequest request = new IndexRequest(index);
        IndexResponse response = null;
        try {
            response = client.index(request, RequestOptions.DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }
}
