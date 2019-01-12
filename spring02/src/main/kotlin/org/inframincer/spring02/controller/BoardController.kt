package org.inframincer.spring02.controller

import org.inframincer.spring02.dto.Board
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import java.time.LocalDateTime

@Controller
@RequestMapping("/boards")
class BoardController {

    @GetMapping
    fun boards(model: Model): String {

        val boards = arrayOf(
                Board(1, "title1", "content1", "name1", 0, LocalDateTime.now()),
                Board(2, "title2", "content2", "name2", 0, LocalDateTime.now()),
                Board(3, "title3", "content3", "name3", 0, LocalDateTime.now())
        )
        model.addAttribute("boards", boards)
        model.addAttribute("test", "controller test string")
        model.addAttribute("count", 50)
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
