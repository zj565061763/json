package com.sd.lib.utils.json.adapter;

import com.google.gson.JsonElement;

public class FloatAdapter extends NumberAdapter<Float>
{
    @Override
    protected Float deserializeJsonElementWhenException(JsonElement json)
    {
        return 0F;
    }

    @Override
    protected Float deserializeJsonElement(JsonElement json)
    {
        return json.getAsFloat();
    }
}
