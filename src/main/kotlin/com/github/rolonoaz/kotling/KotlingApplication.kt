package com.github.rolonoaz.kotling

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlingApplication

fun main(args: Array<String>) {
	runApplication<KotlingApplication>(*args)
}

