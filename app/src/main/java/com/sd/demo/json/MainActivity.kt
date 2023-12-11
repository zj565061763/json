package com.sd.demo.json

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sd.demo.json.databinding.ActivityMainBinding
import com.sd.demo.json.model.UserModel
import com.sd.lib.json.FJson

class MainActivity : AppCompatActivity() {
    private val _binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(_binding.root)
        decodeUser()
    }
}

private fun decodeUser() {
    val json = """
            {"id":"1"}
        """.trimIndent()
    logMsg { "decodeUser:${FJson.fromJson(json, UserModel::class.java)}" }
}

inline fun logMsg(block: () -> String) {
    Log.i("json-demo", block())
}