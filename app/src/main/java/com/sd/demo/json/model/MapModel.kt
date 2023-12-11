package com.sd.demo.json.model

class MapModel {
    var name = "default"

    var map: MutableMap<String, String> = mutableMapOf<String, String>().apply {
        put("key", "value")
    }
}