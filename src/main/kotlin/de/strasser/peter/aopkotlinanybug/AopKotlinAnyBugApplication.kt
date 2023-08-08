package de.strasser.peter.aopkotlinanybug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AopKotlinAnyBugApplication

fun main(args: Array<String>) {
    runApplication<AopKotlinAnyBugApplication>(*args)
}
