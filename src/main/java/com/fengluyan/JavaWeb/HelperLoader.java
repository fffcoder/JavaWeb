package com.fengluyan.JavaWeb;

import com.fengluyan.JavaWeb.helper.BeanHelper;
import com.fengluyan.JavaWeb.helper.ClassHelper;
import com.fengluyan.JavaWeb.helper.ControllerHelper;
import com.fengluyan.JavaWeb.helper.IocHelper;
import com.fengluyan.JavaWeb.util.ClassUtil;

/**
 * Created by fly on 10/22/17.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class,
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
