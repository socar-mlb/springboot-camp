package org.inframincer.spring04.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @GetMapping("/login")
    fun login(@RequestParam(name = "fail", required = false, defaultValue = "false") errorFlag: String): String {
        return "users/login"
    }
}
