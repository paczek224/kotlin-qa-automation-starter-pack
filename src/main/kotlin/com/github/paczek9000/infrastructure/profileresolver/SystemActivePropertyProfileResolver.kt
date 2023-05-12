package com.github.paczek9000.infrastructure.profileresolver

import org.springframework.test.context.ActiveProfilesResolver
import org.springframework.test.context.support.DefaultActiveProfilesResolver

class SystemActivePropertyProfileResolver : ActiveProfilesResolver {

    @JvmField
    var defaultResolver = DefaultActiveProfilesResolver();

    override fun resolve(testClass: Class<*>): Array<String> {
        val profileKey = "spring.profiles.active"

        return if (System.getProperties().containsKey(profileKey)) System.getProperty(profileKey).split("\\s*, \\s*")
            .toTypedArray() else defaultResolver.resolve(testClass)
    }
}