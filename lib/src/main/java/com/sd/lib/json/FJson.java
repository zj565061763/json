package com.sd.lib.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public final class FJson {
    public static final Gson GSON = newGsonBuilder().create();

    private FJson() {
    }

    public static GsonBuilder newGsonBuilder() {
        return new GsonBuilder()
                .registerTypeAdapter(int.class, new IntegerAdapter())
                .registerTypeAdapter(Integer.class, new IntegerAdapter() {
                    @Override
                    protected Integer defaultValueForException(JsonElement json) {
                        return null;
                    }
                })

                .registerTypeAdapter(long.class, new LongAdapter())
                .registerTypeAdapter(Long.class, new LongAdapter() {
                    @Override
                    protected Long defaultValueForException(JsonElement json) {
                        return null;
                    }
                })

                .registerTypeAdapter(float.class, new FloatAdapter())
                .registerTypeAdapter(Float.class, new FloatAdapter() {
                    @Override
                    protected Float defaultValueForException(JsonElement json) {
                        return null;
                    }
                })

                .registerTypeAdapter(double.class, new DoubleAdapter())
                .registerTypeAdapter(Double.class, new DoubleAdapter() {
                    @Override
                    protected Double defaultValueForException(JsonElement json) {
                        return null;
                    }
                })

                .registerTypeAdapter(boolean.class, new BooleanAdapter())
                .registerTypeAdapter(Boolean.class, new BooleanAdapter())

                .registerTypeAdapter(String.class, new StringAdapter());
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

    public static String toJson(Object obj) {
        return GSON.toJson(obj);
    }
}
