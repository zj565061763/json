package com.sd.lib.json;

import com.google.gson.JsonElement;

class FloatAdapter extends NumberAdapter<Float> {
    @Override
    protected Float deserializeImpl(JsonElement json) {
        return json.getAsFloat();
    }

    @Override
    protected Float defaultValueForException(JsonElement json) {
        return 0F;
    }
}
