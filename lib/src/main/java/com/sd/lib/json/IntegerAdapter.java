package com.sd.lib.json;

import com.google.gson.JsonElement;

class IntegerAdapter extends NumberAdapter<Integer> {
    @Override
    protected Integer deserializeJsonElementWhenException(JsonElement json) {
        return 0;
    }

    @Override
    protected Integer deserializeImpl(JsonElement json) {
        return json.getAsInt();
    }
}
