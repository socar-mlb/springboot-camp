package org.inframincer.spring02.controller

import org.inframincer.spring02.dto.Board
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class BoardApiController {

    @GetMapping(path = [("/api/boards/{id}")])
    fun getBoard(@PathVariable id: Long): ResponseEntity<Board> {
        val board = Board(
            id = id,
            name = "kim",
            title = "title$id",
            content = "content$id",
            readCount = id.toInt() + 100,
            createTime = LocalDateTime.now()
        )
        return ResponseEntity(board, HttpStatus.OK)
    }

    @GetMapping(path = ["/api/boards"])
    fun getBoards(): ResponseEntity<List<Board>> {
        val boards = mutableListOf<Board>().apply {
            for (i in 1 until 5) {
                this.add(Board(
                    id = i.toLong(),
                    name = "name$i",
                    title = "title$i",
                    content = "content$i",
                    readCount = i + 100,
                    createTime = LocalDateTime.now()
                ))
            }
        }
        return ResponseEntity(boards, HttpStatus.OK)
    }
}
