
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import org.testng.annotations.Test

@Test
open class BaseTest {

    @JvmField
    var driver: WebDriver? = null;

    @BeforeSuite(alwaysRun = true)
    protected fun setupTests() {
        System.setProperty(
            ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
            System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe"
        )
        driver = ChromeDriver()
    }

    @AfterSuite
    protected fun tearDownTests() {
        try {
            getDriver().quit()
        } catch (exception: Exception) {
            println(exception.message)
        }
    }

    protected fun getDriver(): WebDriver {
        return driver!!
    }
}