package com.fanwe.lib.utils.json;

import com.google.gson.Gson;

import java.util.Map;

public final class FJson
{
    private static final Gson GSON = new Gson();

    private FJson()
    {
    }

    public static <T> T jsonToObject(String json, Class<T> clazz)
    {
        return GSON.fromJson(json, clazz);
    }

    public static String objectToJson(Object obj)
    {
        return GSON.toJson(obj);
    }

    public static <T> T mapToObject(Map map, Class<T> clazz)
    {
        if (map == null)
        {
            return null;
        }
        String json = objectToJson(map);
        return jsonToObject(json, clazz);
    }
}
