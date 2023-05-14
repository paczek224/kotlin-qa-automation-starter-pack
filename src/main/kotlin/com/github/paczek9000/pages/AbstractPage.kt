package com.github.paczek9000.pages

import com.github.paczek9000.utils.selenium.UrlResolver
import com.github.paczek9000.utils.selenium.WebElementUtil
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
abstract class AbstractPage {

    @Autowired
    lateinit var driver: WebDriver

    @Autowired
    lateinit var urlResolver: UrlResolver

    @Autowired
    lateinit var webElementUtil: WebElementUtil

    final fun initPage(){
        PageFactory.initElements(driver, this)
    }
}