package com.tinyurl.tinyurl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TinyurlApplication

	fun main(args: Array<String>) {
		runApplication<TinyurlApplication>(*args)
	}
