package com.sd.demo.json.model

internal open class MapModel {
    var name = "default"

    private var map: MutableMap<String, String> = mutableMapOf<String, String>().apply {
        put("key", "value")
    }
}