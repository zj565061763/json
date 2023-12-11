package com.sd.demo.json.model

open class RequestParams {
    // 不能使用private
    protected var data: MutableMap<String, String>? = null

    fun put(key: String, value: String) {
        val map = data ?: mutableMapOf<String, String>().also {
            data = it
        }
        map[key] = value
    }
}

class PageRequestParams : RequestParams() {
    private var page: RequestPage? = null

    fun setPage(page: Int) {
        this.page = RequestPage(
            page = page,
            pageSize = 10,
        )
    }
}

data class RequestPage(
    val page: Int = 1,
    val pageSize: Int = 10,
)