package com.sd.lib.json;

import com.google.gson.JsonElement;

class LongAdapter extends NumberAdapter<Long> {
    @Override
    protected Long deserializeJsonElementWhenException(JsonElement json) {
        return 0L;
    }

    @Override
    protected Long deserializeImpl(JsonElement json) {
        return json.getAsLong();
    }
}
