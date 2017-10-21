package com.fengluyan.JavaWeb.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by fly on 10/21/17.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if(str!= null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
