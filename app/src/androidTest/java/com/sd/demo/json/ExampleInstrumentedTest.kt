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
    fun testInt() {
        FJson.jsonToObject(
            """
            {"value1":"1","value2":"2"}
        """.trimIndent(),
            IntModel::class.java,
        ).let { model ->
            assertEquals(1, model.value1)
            assertEquals(2, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            IntModel::class.java,
        ).let { model ->
            assertEquals(0, model.value1)
            assertEquals(null, model.value2)
        }
    }
}