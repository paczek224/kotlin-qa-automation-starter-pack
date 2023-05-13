package com.github.paczek9000.pages

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DemoPage : AbstractPage() {

    @FindBy(xpath = "//h1[.='Tools and Taverns']")
    val title: WebElement? = null

    @PostConstruct
    final fun initElements() {
        initPage()
    }

    fun goto() {
        driver.get(urlResolver.getAppUrl())
    }
}
