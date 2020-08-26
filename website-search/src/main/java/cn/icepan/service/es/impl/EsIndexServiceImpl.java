package cn.icepan.service.es.impl;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.indices.CreateIndexResponse;

import java.io.IOException;
import java.util.Map;

public interface EsIndexServiceImpl {
    CreateIndexResponse Create(String index, Map<String, Object> settings, Map<String,Object>... types);

    Boolean Exists(String index);

    AcknowledgedResponse Delete(String index);

    IndexResponse Index(String index) throws IOException;
}
