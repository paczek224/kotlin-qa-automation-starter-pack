import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

class ToolsAndTavernsPage(private val driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    fun goto(){
        driver.get("https://www.toolsandtaverns.com/")
    }
}