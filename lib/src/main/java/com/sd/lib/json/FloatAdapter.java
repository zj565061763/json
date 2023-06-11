package com.sd.lib.json;

import com.google.gson.JsonElement;

class FloatAdapter extends NumberAdapter<Float> {
    @Override
    protected Float deserializeJsonElementWhenException(JsonElement json) {
        return 0F;
    }

    @Override
    protected Float deserializeImpl(JsonElement json) {
        return json.getAsFloat();
    }
}
