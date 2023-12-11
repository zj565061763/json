package com.sd.demo.json.model

import com.squareup.moshi.Json

/**
 * Http请求参数
 */
@PublishedApi
internal open class RequestParams {
    @Json(name = "data")
    private var _data: MutableMap<String, String>? = null

    fun put(key: String, value: String) {
        val map = _data ?: mutableMapOf<String, String>().also {
            _data = it
        }
        map[key] = value
    }
}

/**
 * 带分页的Http请求参数
 */
@PublishedApi
internal class PageRequestParams : RequestParams() {
    @Json(name = "pageQueryReq")
    private var _page: RequestPage? = null

    fun setPage(page: Int) {
        _page = RequestPage(
            page = page,
            pageSize = 10,
        )
    }
}

/**
 * 分页数据
 */
internal data class RequestPage(
    @Json(name = "page") val page: Int = 1,

    @Json(name = "pageSize") val pageSize: Int = 10,
)