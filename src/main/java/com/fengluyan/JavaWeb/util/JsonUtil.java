package com.fengluyan.JavaWeb.util;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fly on 10/22/17.
 */
public final class JsonUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    public static <T> String toJson(T obj) {
        String json;
        json = JSON.toJSONString(obj);
        return json;
    }

    public static <T> T fromJson(String json, Class<T> type) {
        T pojo;
        pojo = JSON.parseObject(json, type);
        return pojo;
    }
}
