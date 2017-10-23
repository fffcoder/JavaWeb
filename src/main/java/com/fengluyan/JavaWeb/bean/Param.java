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

    public String getString(String name) {
        return CastUtil.castString(paramMap.get(name));
    }

    public double getDouble(String name) {
        return CastUtil.castDouble(paramMap.get(name));
    }

    public boolean getBoolean(String name) {
        return CastUtil.castBoolean(paramMap.get(name));
    }

    public int getInt(String name) {
        return CastUtil.castInt(paramMap.get(name));
    }

    public Map<String, Object> getMap() {
        return paramMap;
    }
}
