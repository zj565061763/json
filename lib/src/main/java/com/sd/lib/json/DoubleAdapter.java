package com.sd.lib.json;

import com.google.gson.JsonElement;

class DoubleAdapter extends NumberAdapter<Double> {
    @Override
    protected Double deserializeJsonElementWhenException(JsonElement json) {
        return 0D;
    }

    @Override
    protected Double deserializeImpl(JsonElement json) {
        return json.getAsDouble();
    }
}
