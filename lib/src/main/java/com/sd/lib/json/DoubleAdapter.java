package com.sd.lib.json;

import com.google.gson.JsonElement;

public class DoubleAdapter extends NumberAdapter<Double> {
    @Override
    protected Double deserializeJsonElementWhenException(JsonElement json) {
        return 0D;
    }

    @Override
    protected Double deserializeJsonElement(JsonElement json) {
        return json.getAsDouble();
    }
}
