package com.github.paczek9000.infrastructure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "test")
class TestProperties {

    val gridOn: Boolean? = false
    val timeoutInSeconds: Long = 10
    val port: Int = 443
    lateinit var gridUrl: String
    lateinit var protocol: String
    lateinit var appFile: String
    lateinit var mockLoginUrl: String
    lateinit var host: String
}

