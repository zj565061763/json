package com.sd.lib.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sd.lib.json.adapter.DoubleAdapter;
import com.sd.lib.json.adapter.FloatAdapter;
import com.sd.lib.json.adapter.IntegerAdapter;
import com.sd.lib.json.adapter.LongAdapter;
import com.sd.lib.json.adapter.StringAdapter;

import java.util.Map;

public final class FJson
{
    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(int.class, new IntegerAdapter())
            .registerTypeAdapter(Integer.class, new IntegerAdapter())

            .registerTypeAdapter(long.class, new LongAdapter())
            .registerTypeAdapter(Long.class, new LongAdapter())

            .registerTypeAdapter(float.class, new FloatAdapter())
            .registerTypeAdapter(Float.class, new FloatAdapter())

            .registerTypeAdapter(double.class, new DoubleAdapter())
            .registerTypeAdapter(Double.class, new DoubleAdapter())

            .registerTypeAdapter(String.class, new StringAdapter())
            .create();

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
            return null;

        final String json = objectToJson(map);
        return jsonToObject(json, clazz);
    }
}
