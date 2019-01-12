package org.inframincer.spring02.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/boards")
class BoardController {

    @GetMapping
    fun boards(model: Model): String {
        model.addAttribute("boards", "boards attribute")
        return "boards"
    }

    @GetMapping("/{id}")
    fun board(@PathVariable(name = "id")id: Long, model: Model): String {
        println("id $id")
        model.addAttribute("board", "board attribute")
        return "board"
    }

    @GetMapping("/write")
    fun write(): String {
        return "redirect:/boards"
    }
}
