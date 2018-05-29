package com.micheal.kotlin

import com.micheal.kotlin.utils.Base1
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun  testAdd(){
        println(Base1.add(1,2));
        assertEquals(3, Base1.add(1,2))
    }

}
