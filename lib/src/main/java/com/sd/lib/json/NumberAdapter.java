package com.sd.lib.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

abstract class NumberAdapter<T> implements JsonDeserializer<T> {
    @Override
    public final T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return deserializeImpl(json);
        } catch (Exception e) {
            final String stringValue = json.getAsString();
            if ("".equals(stringValue) ||
                    "null".equalsIgnoreCase(stringValue) ||
                    "false".equalsIgnoreCase(stringValue)) {
                return defaultValueForException(json);
            } else {
                throw e;
            }
        }
    }

    protected abstract T deserializeImpl(JsonElement json);

    protected abstract T defaultValueForException(JsonElement json);
}
