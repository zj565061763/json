package com.sd.lib.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

final class BooleanAdapter implements JsonDeserializer<Boolean> {
    @Override
    public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final String stringValue = json.getAsString();
        final boolean legal = "true".equalsIgnoreCase(stringValue) || "false".equalsIgnoreCase(stringValue);
        if (legal) {
            return json.getAsBoolean();
        } else {
            if (typeOfT == boolean.class) {
                return false;
            } else if (typeOfT == Boolean.class) {
                return null;
            } else {
                throw new IllegalStateException("Unknown type:" + typeOfT);
            }
        }
    }
}
