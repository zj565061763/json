package com.sd.lib.json;

import com.google.gson.JsonElement;

class DoubleAdapter extends NumberAdapter<Double> {
    @Override
    protected Double deserializeImpl(JsonElement json) {
        return json.getAsDouble();
    }

    @Override
    protected Double defaultValueForException(JsonElement json) {
        return 0D;
    }
}
