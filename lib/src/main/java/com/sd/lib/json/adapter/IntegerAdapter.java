package com.sd.lib.json.adapter;

import com.google.gson.JsonElement;

public class IntegerAdapter extends NumberAdapter<Integer>
{
    @Override
    protected Integer deserializeJsonElementWhenException(JsonElement json)
    {
        return 0;
    }

    @Override
    protected Integer deserializeJsonElement(JsonElement json)
    {
        return json.getAsInt();
    }
}
