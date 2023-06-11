package com.sd.lib.json;

import com.google.gson.JsonElement;

class BooleanAdapter extends NumberAdapter<Boolean> {
    @Override
    protected Boolean deserializeImpl(JsonElement json) {
        return json.getAsBoolean();
    }

    @Override
    protected Boolean defaultValueForException(JsonElement json) {
        return false;
    }
}
