package com.github.paczek9000.infrastructure.drivers

import com.github.paczek9000.infrastructure.TestProperties
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.RemoteWebDriver
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import java.net.URI
import java.nio.file.Paths

class ChromeDriverManager : DriverManager() {

    @Autowired
    var properties: TestProperties? = null
    var chromeDriverService: ChromeDriverService? = null
    val logger = LoggerFactory.getLogger(ChromeDriverManager::class.java)

    override fun startService() {

        try {

            val path = System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe"
            val chromeDriverPath = Paths.get(path)

            logger.info("Starting Chrome driver service...\nexe path {}", path)

            chromeDriverService = ChromeDriverService.Builder()
                .usingDriverExecutable(chromeDriverPath.toFile())
                .usingAnyFreePort()
                .build()

            chromeDriverService!!.start()

        } catch (err: Exception) {
            println(err.message)
        }
    }

    override fun createDriver() {
        logger.info("Creating Chrome driver ...")

        driver = if (properties!!.gridOn!!) {
            val toURL = URI(properties!!.gridUrl).toURL()
            RemoteWebDriver(toURL, ChromeOptions())
        } else {
            ChromeDriver(chromeDriverService, ChromeOptions())
        }
    }

    override fun quitDriver() {
        logger.info("Stopping Chrome driver ...")

        driver().quit()

        Thread.sleep(1500)

        chromeDriverService!!.stop()
    }
}

