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
        val clazz = IntModel::class.java
        FJson.jsonToObject(
            """
            {"value1":"1","value2":"2"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(1, model.value1)
            assertEquals(2, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"null","value2":"null"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"false","value2":"false"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0, model.value1)
            assertEquals(null, model.value2)
        }
    }

    @Test
    fun testLong() {
        val clazz = LongModel::class.java
        FJson.jsonToObject(
            """
            {"value1":"1","value2":"2"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(1L, model.value1)
            assertEquals(2L, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0L, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"null","value2":"null"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0L, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"false","value2":"false"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0L, model.value1)
            assertEquals(null, model.value2)
        }
    }

    @Test
    fun testFloat() {
        val clazz = FloatModel::class.java
        FJson.jsonToObject(
            """
            {"value1":"1","value2":"2"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(1F, model.value1)
            assertEquals(2F, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0F, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"null","value2":"null"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0F, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"false","value2":"false"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0F, model.value1)
            assertEquals(null, model.value2)
        }
    }

    @Test
    fun testDouble() {
        val clazz = DoubleModel::class.java
        FJson.jsonToObject(
            """
            {"value1":"1","value2":"2"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(1.0, model.value1, 0.01)
            assertEquals(2.0, model.value2!!, 0.01)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0.0, model.value1, 0.01)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"null","value2":"null"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0.0, model.value1, 0.01)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"false","value2":"false"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(0.0, model.value1, 0.01)
            assertEquals(null, model.value2)
        }
    }

    @Test
    fun testBoolean() {
        val clazz = BooleanModel::class.java
        FJson.jsonToObject(
            """
            {"value1":"true","value2":"true"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(true, model.value1)
            assertEquals(true, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"","value2":""}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(false, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"null","value2":"null"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(false, model.value1)
            assertEquals(null, model.value2)
        }

        FJson.jsonToObject(
            """
            {"value1":"false","value2":"false"}
        """.trimIndent(),
            clazz,
        ).let { model ->
            assertEquals(false, model.value1)
            assertEquals(false, model.value2)
        }
    }
}