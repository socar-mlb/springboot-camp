package org.inframincer.spring03.domain

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Board(
    var name: String,
    var title: String,
    var content: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    var readCount = 0
    @Column(name = "regdate")
    var registerDateTime: LocalDateTime = LocalDateTime.now()

    override fun toString(): String {
        return "Board(name='$name', " +
            "title='$title', " +
            "content='$content', " +
            "id=$id, " +
            "readCount=$readCount, " +
            "registerDateTime=$registerDateTime)"
    }
}
