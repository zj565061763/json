package com.sd.lib.json;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;

public final class FJson {

    public static final Moshi Moshi = new Moshi.Builder()
            .add(new KotlinJsonAdapterFactory())
            .build();

    private FJson() {
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        final JsonAdapter<T> adapter = Moshi.adapter(clazz);
        return adapter.fromJson(json);
    }

    public static <T> String toJson(T instance, Class<T> clazz) {
        final JsonAdapter<T> adapter = Moshi.adapter(clazz);
        return adapter.toJson(instance);
    }
}
