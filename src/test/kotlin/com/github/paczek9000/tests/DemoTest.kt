package com.github.paczek9000.tests

import org.testng.annotations.Test
import kotlin.test.assertEquals

class DemoTest: BaseTest() {

    @Test
    fun demoTest() {

        demoPage.goto()

        assertEquals("Demo fail", demoPage.title!!.text)
    }
}