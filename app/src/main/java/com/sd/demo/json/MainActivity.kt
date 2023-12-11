package com.sd.demo.json

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sd.demo.json.databinding.ActivityMainBinding
import com.sd.demo.json.model.PageRequestParams
import com.sd.demo.json.model.UserModel
import com.sd.lib.json.FJson

class MainActivity : AppCompatActivity() {
    private val _binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(_binding.root)

        _binding.btnEncode.setOnClickListener {
            encodeRequestParams()
        }

        _binding.btnDecode.setOnClickListener {
            decodeUser()
        }
    }
}

private fun decodeUser() {
    val json = """
            {"id":"1","name":null,"age":null}
        """.trimIndent()
    val model = FJson.fromJson(json, UserModel::class.java)
    logMsg {
        "decodeDataUser:${model}"
    }
}

private fun encodeRequestParams() {
    val model = PageRequestParams().apply {
        this.put("key", "value")
        this.setPage(1)
    }
    val json = FJson.toJson(model, PageRequestParams::class.java)
    logMsg {
        "encodeRequestParams:$json"
    }
}

inline fun logMsg(block: () -> String) {
    Log.i("json-demo", block())
}