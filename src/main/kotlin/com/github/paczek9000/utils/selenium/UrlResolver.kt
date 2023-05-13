package com.github.paczek9000.utils.selenium

import com.github.paczek9000.infrastructure.TestProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.net.URI

@Component
class UrlResolver {

    @Autowired
    lateinit var testProperties: TestProperties

    fun getAppUrl(): String {
        return URI(testProperties.protocol + "://www." + testProperties.host + ":" + testProperties.port + "/")
            .toURL()
            .toString()
    }
}