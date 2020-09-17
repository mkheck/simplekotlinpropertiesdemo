package com.example.kotlinpropsdemo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinpropsdemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinpropsdemoApplication>(*args)
}

@RestController
@RequestMapping("/coffee")
class CoffeeController {
	@Value("\${coffee}")
	private lateinit var coffee: String

	@GetMapping
	fun getCoffee() = coffee
}