package org.inframincer.spring04.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/main")
    fun main(): String {
        return "index"
    }
}