package com.sd.lib.json

import com.squareup.moshi.Moshi

object FJson {

    @JvmStatic
    val moshi: Moshi = Moshi.Builder().addAdapterIgnoreNull().build()

    /**
     * 忽略json中值为null的字段
     */
    fun addAdapterIgnoreNull(builder: Moshi.Builder) {
        builder.addLast(StandardJsonAdapters.FACTORY)
        builder.addLast(FKotlinJsonAdapterFactory())
    }

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

/**
 * 忽略json中值为null的字段
 */
fun Moshi.Builder.addAdapterIgnoreNull(): Moshi.Builder {
    FJson.addAdapterIgnoreNull(this)
    return this
}