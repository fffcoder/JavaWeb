package com.fengluyan.JavaWeb.bean;

import com.fengluyan.JavaWeb.util.CastUtil;

import java.util.Map;

/**
 * Created by fly on 10/22/17.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
