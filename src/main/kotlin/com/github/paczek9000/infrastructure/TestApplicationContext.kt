package com.github.paczek9000.infrastructure

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties
@ComponentScan(value = ["com.github.*"])
class TestApplicationContext {
}