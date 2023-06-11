package com.sd.lib.json;

import com.google.gson.JsonElement;

class LongAdapter extends NumberAdapter<Long> {
    @Override
    protected Long deserializeImpl(JsonElement json) {
        return json.getAsLong();
    }

    @Override
    protected Long defaultValueForException(JsonElement json) {
        return 0L;
    }
}
