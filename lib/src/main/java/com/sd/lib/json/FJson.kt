package com.sd.lib.json

import com.squareup.moshi.Moshi

object FJson {

    @JvmStatic
    val moshi: Moshi = Moshi.Builder()
        .add(StandardJsonAdapters.FACTORY)
        .add(FKotlinJsonAdapterFactory())
        .build()

    @JvmStatic
    fun <T> fromJson(json: String?, clazz: Class<T>): T? {
        if (json.isNullOrEmpty()) return null
        return moshi.adapter(clazz).fromJson(json)
    }

    @JvmStatic
    fun <T> toJson(instance: T, clazz: Class<T>): String {
        return moshi.adapter(clazz).toJson(instance)
    }
}