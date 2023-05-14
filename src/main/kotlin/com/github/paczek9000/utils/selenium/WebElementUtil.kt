package com.github.paczek9000.utils.selenium

import org.awaitility.Awaitility.await
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class WebElementUtil {

    @Autowired
    lateinit var driver: WebDriver

    fun waitForElementDisplayed(element: WebElement) {

        await(String.format("Waiting for element to be displayed element:<%s>", element))
            .until { element.isDisplayed }
    }

    fun waitForNotEmpty(elements: List<WebElement>) {

        await(String.format("Waiting list to not be empty elements:<%s>", elements))
            .until { elements.isNotEmpty() }
    }
}