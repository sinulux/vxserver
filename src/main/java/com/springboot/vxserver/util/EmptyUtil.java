package com.springboot.vxserver.util;

/**
 * @author wangshibao
 * @ClassName EmptyUtil
 * @Description 为空校验
 * @date 2018/4/23 10:31
 */
public final class EmptyUtil {

    private EmptyUtil() {

    }

    public static Boolean isEmpty(String param) {
        Boolean isEmpty = false;
        if (param == null || param.trim().length() == 0 || param.trim().replaceAll("\"", "").length() == 0) {
            isEmpty = true;
        }

        return isEmpty;
    }

    public static Boolean isEmpty(Integer param) {
        Boolean isEmpty = false;
        if (param == null || param.intValue() == 0) {
            isEmpty = true;
        }

        return isEmpty;
    }

    public static Boolean isEmpty(Long param) {
        Boolean isEmpty = false;
        if (param == null || param.longValue() == 0) {
            isEmpty = true;
        }

        return isEmpty;
    }

}
