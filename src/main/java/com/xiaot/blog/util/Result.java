package com.xiaot.blog.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoT
 */
public class Result {

    public static Map<String, Object> result(int code, String msg, Object data) {
        Map<String, Object> map = new HashMap<>(3);
        map.put("code", code);
        map.put("msg", msg);
        map.put("data", data);
        return map;
    }

    public static Map<String, Object> result(Object data, String token) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("token", token);
        map.put("user", data);
        return result(200, null, map);
    }

    public static Map<String, Object> result(Integer code, String msg) {
        return result(code, msg, null);
    }

    public static Map<String, Object> result(Long total, List<?> list) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("total", total);
        map.put("list", list);
        return result(200, null, map);
    }

    public static Map<String, Object> result(String msg) {
        return result(200, msg, null);
    }

}
