package me.macintoshhd

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class TestSum {
    @Test
    fun testSum() {
        val sumNumber = Sum()
        assertContains(sumNumber.sayHello(), "Hello")
        assertEquals(sumNumber.sum2Numbers(1,2), 3)
    }
}