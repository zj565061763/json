package com.sd.demo.json

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.sd.lib.json.FJson
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun test() {
        val json = "{\"valueInt\":\"1\", \"valueLong\":\"2\", \"valueFloat\":\"3.3\", \"valueDouble\":\"4.4\"}"
        val model = FJson.jsonToObject(json, TestModel::class.java)
    }
}