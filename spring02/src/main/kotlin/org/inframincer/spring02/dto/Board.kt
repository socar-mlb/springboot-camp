package org.inframincer.spring02.dto

import java.time.LocalDateTime

data class Board(
        val id: Long,
        val title: String,
        val content: String,
        val name: String,
        val readCount: Int,
        val createTime: LocalDateTime
)