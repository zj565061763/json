package com.fanwe.lib.utils.json.adapter;

import com.google.gson.JsonElement;

public class IntegerAdapter extends NumberAdapter<Integer>
{
    @Override
    protected Integer deserializeIllegalJsonElement(JsonElement json)
    {
        return 0;
    }

    @Override
    protected Integer deserializeJsonElement(JsonElement json)
    {
        return json.getAsInt();
    }
}
