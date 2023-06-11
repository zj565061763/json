package com.sd.demo.json

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.gson.GsonBuilder
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
        val json = """
            {"valueInt":"1","valueLong":"2","valueFloat":"3.3","valueDouble":"4.4","valueBoolean":"true"}
        """.trimIndent()

        val gson = GsonBuilder().create()

        gson.fromJson(json, TestModel::class.java).let { model ->
            assertEquals(1, model.valueInt)
            assertEquals(2, model.valueLong)
            assertEquals(3.3f, model.valueFloat)
            assertEquals(4.4, model.valueDouble, 0.01)
            assertEquals(true, model.valueBoolean)
        }
    }
}