package com.sd.demo.json.model

import com.squareup.moshi.Json

class MapModel {
    var name = "default"

    @Json(name = "data")
    private var _data: MutableMap<String, String>? = null

    fun put(key: String, value: String) {
        val map = _data ?: mutableMapOf<String, String>().also {
            _data = it
        }
        map[key] = value
    }
}