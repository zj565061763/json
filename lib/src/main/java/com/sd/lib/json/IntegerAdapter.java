package com.sd.lib.json;

import com.google.gson.JsonElement;

class IntegerAdapter extends NumberAdapter<Integer> {
    @Override
    protected Integer deserializeImpl(JsonElement json) {
        return json.getAsInt();
    }

    @Override
    protected Integer defaultValueForException(JsonElement json) {
        return 0;
    }
}
