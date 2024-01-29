package com.hansol.springlab.common

import io.github.oshai.kotlinlogging.KotlinLogging

class GlobalLogger {
    companion object {
        val logger = KotlinLogging.logger {}
    }
}