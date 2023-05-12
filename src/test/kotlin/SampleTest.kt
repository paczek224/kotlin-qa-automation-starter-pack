import kotlin.test.assertEquals

class SampleTest : BaseTest() {

    fun tc1(){
        val page = ToolsAndTavernsPage(getDriver())
        page.goto()

        assertEquals(getDriver().currentUrl, "https://www.toolsandtaverns.com/123")
    }
}