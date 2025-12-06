package kr.ac.kumoh.s20201226.mongodb_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MongodbBackendApplication

fun main(args: Array<String>) {
	runApplication<MongodbBackendApplication>(*args)
}
