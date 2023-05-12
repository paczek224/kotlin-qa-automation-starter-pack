package com.github.paczek9000.infrastructure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "test")
class TestProperties {

    var gridOn: Boolean? = false
}