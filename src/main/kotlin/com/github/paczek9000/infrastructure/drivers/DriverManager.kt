package com.github.paczek9000.infrastructure.drivers

import org.openqa.selenium.WebDriver

abstract class DriverManager {

    protected var driver: WebDriver? = null

    abstract fun startService()

    abstract fun createDriver()

    abstract fun quitDriver()

    fun driver(): WebDriver {
        if(driver == null){
            startService()
            createDriver()
        }
        return driver!!
    }
}

