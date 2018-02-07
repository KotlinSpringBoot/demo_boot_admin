package com.easy.springboot.demo_boot_admin

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAdminServer
open class DemoBootAdminApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoBootAdminApplication::class.java, *args)
}