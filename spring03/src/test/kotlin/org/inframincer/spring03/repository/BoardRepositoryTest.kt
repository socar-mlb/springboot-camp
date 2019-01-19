package org.inframincer.spring03.repository

import org.inframincer.spring03.domain.Board
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.annotation.Rollback
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional

@RunWith(SpringRunner::class)
@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BoardRepositoryTest {

    @Autowired
    lateinit var boardRepository: BoardRepository

    @Test
    fun getAll() {
        println(boardRepository.javaClass)
        val boards = boardRepository.findAll()
        boards.forEach {
            println(it.toString())
        }
    }

    @Test
    @Rollback(false)
    fun addBoard() {
        var board = Board(
            name = "name1",
            title = "title1",
            content = "content1"
        )
        board = boardRepository.save(board)
        println(board)
    }

    @Test
    @Rollback(false)
    fun updateBoard() {
        var board = boardRepository.findById(1)
        board.get().title = "title1000"
        board.get().content = "content1000"
    }
}
