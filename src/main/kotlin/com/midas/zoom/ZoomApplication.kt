package com.midas.zoom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ZoomApplication

fun main(args: Array<String>) {
    runApplication<ZoomApplication>(*args)
}
