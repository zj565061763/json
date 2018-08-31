package com.fanwe.lib.utils.json.adapter;

import com.google.gson.JsonElement;

public class DoubleAdapter extends NumberAdapter<Double>
{
    @Override
    protected Double deserializeJsonElementWhenException(JsonElement json)
    {
        return 0D;
    }

    @Override
    protected Double deserializeJsonElement(JsonElement json)
    {
        return json.getAsDouble();
    }
}
