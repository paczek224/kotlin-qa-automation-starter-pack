package com.github.paczek9000.tests
import com.github.paczek9000.infrastructure.TestApplicationContext
import com.github.paczek9000.infrastructure.TestProperties
import com.github.paczek9000.infrastructure.drivers.DriverManager
import com.github.paczek9000.pages.DemoPage
import com.github.paczek9000.utils.selenium.UrlResolver
import org.junit.jupiter.api.extension.ExtendWith
import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests

@ExtendWith(SpringExtension::class)
@SpringBootTest
@ContextConfiguration(classes = [TestApplicationContext::class])
class TestDependencyPool : AbstractTestNGSpringContextTests(){

    @Autowired
    protected lateinit var testProperties : TestProperties

    @Autowired
    protected lateinit var driverManager : DriverManager

    @Autowired
    protected lateinit var driver : WebDriver

    @Autowired
    protected lateinit var urlResolver : UrlResolver

    @Autowired
    protected lateinit var demoPage: DemoPage
}