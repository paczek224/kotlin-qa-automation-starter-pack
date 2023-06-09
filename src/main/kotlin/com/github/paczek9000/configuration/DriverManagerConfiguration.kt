package com.github.paczek9000.configuration

import com.github.paczek9000.infrastructure.drivers.ChromeDriverManager
import com.github.paczek9000.infrastructure.drivers.DriverManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class DriverManagerConfiguration {

    @Bean
    @Profile("chrome")
    fun chromeDriverManager(): DriverManager {
        return ChromeDriverManager()
    }
}
