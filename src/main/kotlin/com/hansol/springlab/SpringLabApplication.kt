package com.hansol.springlab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringLabApplication

fun main(args: Array<String>) {
	runApplication<SpringLabApplication>(*args)
}
