package com.github.paczek9000.tests

import com.github.paczek9000.infrastructure.profileresolver.SystemActivePropertyProfileResolver
import org.awaitility.Awaitility
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.test.context.ActiveProfiles
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import java.time.Duration

@ActiveProfiles(value = ["dev", "chrome"], resolver = SystemActivePropertyProfileResolver::class)
@Test
class BaseTest : TestDependencyPool() {

   private val testLogger: Logger = LoggerFactory.getLogger(BaseTest::class.java)

    @BeforeTest(alwaysRun = true)
    protected fun setupTest() {
        testLogger.info("Starting test...")

        super.springTestContextPrepareTestInstance()

        Awaitility.setDefaultTimeout(Duration.ofSeconds(testProperties.timeoutInSeconds.toLong()))
        Awaitility.ignoreExceptionsByDefault()

    }

    @AfterTest(alwaysRun = true)
    protected fun tearDownDriver() {

        testLogger.info("Tearing down test...")

        driverManager.quitDriver()
    }
}