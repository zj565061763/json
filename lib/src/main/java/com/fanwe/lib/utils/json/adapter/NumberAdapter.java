package com.fanwe.lib.utils.json.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public abstract class NumberAdapter<T> implements JsonDeserializer<T>
{
    @Override
    public final T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        try
        {
            return deserializeJsonElement(json);
        } catch (Exception e)
        {
            final String valueString = json.getAsString();
            if ("".equals(valueString) || "null".equals(valueString) || "false".equals(valueString))
            {
                return deserializeJsonElementWhenException(json);
            } else
            {
                throw new JsonParseException(e);
            }
        }
    }

    protected abstract T deserializeJsonElementWhenException(JsonElement json);

    protected abstract T deserializeJsonElement(JsonElement json);
}
